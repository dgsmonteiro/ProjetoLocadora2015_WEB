package model;

public class Devolucao {
	private double acrescimo;
	private int agenciaDevolu��o;
	private String dataDevolucao;
	private double kmDevolucao;

	public Devolucao(double acrescimo, int agenciaDevolu��o,
			String dataDevolucao, double kmDevolucao) {
		setAcrescimo(acrescimo);
		setAgenciaDevolu��o(agenciaDevolu��o);
		setDataDevolucao(dataDevolucao);
		setKmDevolucao(kmDevolucao);
	}

	public void devolver() {

	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public int getAgenciaDevolu��o() {
		return agenciaDevolu��o;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public double getKmDevolucao() {
		return kmDevolucao;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	public void setAgenciaDevolu��o(int agenciaDevolu��o) {
		this.agenciaDevolu��o = agenciaDevolu��o;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public void setKmDevolucao(double kmDevolucao) {
		this.kmDevolucao = kmDevolucao;
	}
}
