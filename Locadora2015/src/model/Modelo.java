package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;


public class Modelo implements ComboBoxModel<Object> {
	private int codigo;
	private String descricao;
	private String fabricante;
	private String grupo;
	private String modelo;
	private double tarifaKmControlado;
	private double tarifaKmLivre;
	public Connection conn = null;

	public Modelo() {
		
	}
	
	public Modelo(int codigo, String descricao, String fabricante,
			String grupo, String modelo, double tarifaKmControlado,
			double tarifaKmLivre) {
		
		setCodigo(codigo);
		setDescricao(descricao);
		setFabricante(fabricante);
		setGrupo(grupo);
		setModelo(modelo);
		setTarifaKmControlado(tarifaKmControlado);
		setTarifaKmLivre(tarifaKmLivre);
		
		
	}

	public void alterar(int codigo, String descricao, String fabricante,
			String grupo, String modelo, double tarifaKmControlado,
			double tarifaKmLivre) throws SQLException {
		
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO modDAO = new dao.ModeloDAO();
	
	
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
	
		modDAO.alterar(conn,codigo, descricao, fabricante, grupo, modelo, tarifaKmControlado, tarifaKmLivre);
		conn.commit();
		
	}
	
	
	public Modelo consultar(int codigo) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO modelo = new dao.ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
	
		return modelo.carregar(conn, codigo);
		
	}
	
	public int getC(String modelo) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO mo = new dao.ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
	
		
		return mo.carregarCod(conn,modelo);
		
	}
	
	
	public ArrayList<String> consultaNome() throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO mod = new dao.ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
	
		
		return mod.carregarPorNome(conn);
		
	}

	public void incluir(int codigo, String descricao, String fabricante,
			String grupo, String modelo, double tarifaKmControlado,
			double tarifaKmLivre) throws SQLException {
			
		dao.ModeloDAO objmod = new dao.ModeloDAO();	
		dao.AcessoBD bd = new dao.AcessoBD();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		objmod.incluir(conn,codigo,descricao,fabricante,grupo,modelo,tarifaKmControlado,tarifaKmLivre);	
		
		conn.commit();
		
		
	}

	public void excluir(int codigo) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO modelo = new dao.ModeloDAO();
		conn =  bd.obtemConexao();
		conn.setAutoCommit(false);
		modelo.excluir(conn,codigo);
		conn.commit();
      
	}

	
	public int disponibilidade(String automovel) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO m = new dao.ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
			int t = 0;
			t=  m.carregarCod(conn,automovel);
			System.out.println("Negócio::::::::: select" + automovel);
			return m.disponibilidade(conn,t);
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getGrupo() {
		return grupo;
	}

	public String getModelo() {
		return modelo;
	}

	public double getTarifaKmControlado() {
		return tarifaKmControlado;
	}

	public double getTarifaKmLivre() {
		return tarifaKmLivre;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTarifaKmControlado(double tarifaKmControlado) {
		this.tarifaKmControlado = tarifaKmControlado;
	}

	public void setTarifaKmLivre(double tarifaKmLivre) {
		this.tarifaKmLivre = tarifaKmLivre;
	}

	public ComboBoxModel toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getElementAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSelectedItem(Object arg0) {
		// TODO Auto-generated method stub
		
	}

}
