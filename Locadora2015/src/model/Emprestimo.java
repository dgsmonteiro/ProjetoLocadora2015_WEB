package model;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import com.mysql.fabric.xmlrpc.base.Data;

public class Emprestimo {
	private int agenciaEmprestimo;
	private int agPrevDevolucao;
	private boolean cadeiraDeBebe;
	private String dataHoraEmprestimo;
	private String dataHoraPrevDevolucao;
	private boolean gps;
	private double kmEmprestimo;
	private boolean motorista;
	private int numero;
	private double tipoTarifa;
	 
	
	
	public Connection conn = null;

	public Emprestimo(int agenciaEmprestimo, int agPrevDevolucao,
			boolean cadeiraDeBebe, String dataHoraEmprestimo,
			String dataHoraPrevDevolucao, boolean gps, double kmEmprestimo,
			boolean motorista, int numero, double tipoTarifa) {
		setAgenciaEmprestimo(agenciaEmprestimo);
		setAgPrevDevolucao(agPrevDevolucao);
		setCadeiraDeBebe(cadeiraDeBebe);
		setDataHoraEmprestimo(dataHoraEmprestimo);
		setDataHoraPrevDevolucao(dataHoraPrevDevolucao);
		setGps(gps);
		setKmEmprestimo(kmEmprestimo);
		setMotorista(motorista);
		setNumero(numero);
		setTipoTarifa(tipoTarifa);
	}
	
	public Emprestimo(){
		
	}

	public void consultar() {

	}

	public void consultarEmprestimosDiarios() {

	}

	public void salvar(String dataHora,String previsao, double tipoTarifa,String cpfCli,double valor,String placaAut) throws SQLException {
				
			dao.EmprestimoDAO obj = new dao.EmprestimoDAO();	
			dao.AcessoBD bd = new dao.AcessoBD();
			conn = bd.obtemConexao();
			conn.setAutoCommit(false);
			
			obj.salvar(conn,dataHora,previsao, tipoTarifa,cpfCli,valor,placaAut);	
			
			conn.commit();
			
	

	}

	public int getAgenciaEmprestimo() {
		return agenciaEmprestimo;
	}

	public int getAgPrevDevolucao() {
		return agPrevDevolucao;
	}

	public String getDataHoraEmprestimo() {
		return dataHoraEmprestimo;
	}

	public String getDataHoraPrevDevolucao() {
		return dataHoraPrevDevolucao;
	}

	public double getKmEmprestimo() {
		return kmEmprestimo;
	}

	public int getNumero() {
		return numero;
	}

	public double getTipoTarifa() {
		return tipoTarifa;
	}

	public boolean isCadeiraDeBebe() {
		return cadeiraDeBebe;
	}

	public boolean isGps() {
		return gps;
	}

	public boolean isMotorista() {
		return motorista;
	}

	public void setAgenciaEmprestimo(int agenciaEmprestimo) {
		this.agenciaEmprestimo = agenciaEmprestimo;
	}

	public void setAgPrevDevolucao(int agPrevDevolucao) {
		this.agPrevDevolucao = agPrevDevolucao;
	}

	public void setCadeiraDeBebe(boolean cadeiraDeBebe) {
		this.cadeiraDeBebe = cadeiraDeBebe;
	}

	public void setDataHoraEmprestimo(String dataHoraEmprestimo) {
		this.dataHoraEmprestimo = dataHoraEmprestimo;
	}

	public void setDataHoraPrevDevolucao(String dataHoraPrevDevolucao) {
		this.dataHoraPrevDevolucao = dataHoraPrevDevolucao;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public void setKmEmprestimo(double kmEmprestimo) {
		this.kmEmprestimo = kmEmprestimo;
	}

	public void setMotorista(boolean motorista) {
		this.motorista = motorista;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTipoTarifa(double tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
}
