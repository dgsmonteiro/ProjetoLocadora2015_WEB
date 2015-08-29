package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ConsultarModelo {
	public Connection conn = null;
	private JComboBox<String> cbxCategoria;
	private JComboBox<String> cbxModelo;
	private JTextField txtDescricao;
	private Automovel auto;
	private Modelo modelo;
	
	public ConsultarModelo(){
	}
	public JComboBox<String> comboCategoria(){
	cbxCategoria = new JComboBox<String>();
	cbxCategoria.addItem("");
	cbxCategoria.addItem("A � Econ�mico");
	cbxCategoria.addItem("C � Econ�mico com Ar");
	cbxCategoria.addItem("F � Intermedi�rio");
	cbxCategoria.addItem("G � Intermedi�rio Wagon Especial");
	cbxCategoria.addItem("H � Executivo");
	cbxCategoria.addItem("I � Utilit�rio");
	cbxCategoria.addItem("K � Executivo Luxo");
	cbxCategoria.addItem("M � Intermedi�rio Wagon");
	cbxCategoria.addItem("N � Pick-up;");
	cbxCategoria.addItem("P � 4 x 4 Especial");
	cbxCategoria.addItem("R � Minivan");
	cbxCategoria.addItem("U � Furg�o");
	cbxCategoria.addItem("Y � Blindado");
	return cbxCategoria;
	}
	
	public ArrayList<String> consultaCategoria(String categoria) throws SQLException {
			//System.out.println("negocios" + categoria);
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO mod = new dao.ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		
		return mod.carregarPorCategoria(conn, categoria);
		
	}
	
	/*public JComboBox<String> comboModelo() throws SQLException{
		cbxModelo = new JComboBox<String>();
		ArrayList<String> m = new ArrayList<String>();
		m = consultaCategoria();
		cbxModelo = new JComboBox<String>();
		cbxModelo.setBounds(380, 201, 140, 20);
	
		for(int i=0;i < m.size(); i++ ){
			cbxModelo.addItem(m.get(i));
		}
	return cbxModelo;
	}*/
}
