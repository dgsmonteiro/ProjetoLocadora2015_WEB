package model;

import java.sql.SQLException;
import java.util.ArrayList;

public class Automovel extends Modelo {
	private String agencia;
	private String ano;

	private String chassi;


	private String estado;

	private double km;

	private String placa;

	private String status;
	


	public Automovel() {

	}


	public Automovel(String agencia, String ano, String chassi, 
		String estado, double km, String placa, String status) {
		setAgencia(agencia);
		setAno(ano);
		setChassi(chassi);
	
		setEstado(estado);
		setKm(km);
		setPlaca(placa);
		setStatus(status);
	}



	
	public void incluir(String placa, String agencia, String ano, String chassi, 
			String estado, double km, String modelo) throws SQLException {
			//int p;
			dao.AutomovelDAO automovel = new dao.AutomovelDAO();
			dao.AcessoBD bd = new dao.AcessoBD();
			conn = bd.obtemConexao();
			model.Modelo mod = new model.Modelo();
		//	p= mod.getC(modelo);
		
			
			
			conn.setAutoCommit(false);
			
			automovel.incluir(conn,placa, agencia, ano, chassi,estado,km,mod.getC(modelo));
			conn.commit();
			 

		}
		

	public Automovel consultar(String placa) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.AutomovelDAO automovel = new dao.AutomovelDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		return automovel.carregar(conn,placa);
	}

	
	public void excluir(String placa) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.AutomovelDAO automovel = new dao.AutomovelDAO();
		conn =  bd.obtemConexao();
		conn.setAutoCommit(false);
		automovel.excluir(conn,placa);
		conn.commit();
      
	}
	
	public void alterar(String agencia, String ano, String chassi, 
			String estado, double km, String placa) throws SQLException {
		
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.AutomovelDAO autDAO = new dao.AutomovelDAO();
	
	
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
	
		autDAO.alterar(conn,agencia,ano,chassi,estado,km,placa);
		conn.commit();
		
	}

	public String getAgencia() {
		return agencia;
	}

	public String getAno() {
		return ano;
	}

	public String getChassi() {
		return chassi;
	}



	public String getEstado() {
		return estado;
	}

	public double getKm() {
		return km;
	}

	public String getPlaca() {
		return placa;
	}

	public void incluir() {

	}
	public String isStatus() {
		return status;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	


	
	public ArrayList<String> consultaNome() throws SQLException {
		Modelo mod = new Modelo();		
		return mod.consultaNome();
		
	}
	
	 
	public Modelo consultarMod(String modelo) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		model.Modelo objMod = new model.Modelo();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		
		int p = objMod.getC(modelo);

		return objMod.consultar(p);
		
	}

	public Automovel aleatorio(String modelo) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		model.Modelo objMod = new model.Modelo();
		dao.AutomovelDAO objAut = new dao.AutomovelDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		System.out.println(modelo);
		int p = objMod.getC(modelo);
		System.out.println(p);

		return objAut.aleatorio(conn,p);
		
	}


	
}
