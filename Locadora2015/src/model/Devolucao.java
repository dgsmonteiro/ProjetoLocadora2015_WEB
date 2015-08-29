package model;

public class Devolucao {
	private double acrescimo;
	private int agenciaDevolução;
	private String dataDevolucao;
	private double kmDevolucao;

	public Devolucao(double acrescimo, int agenciaDevolução,
			String dataDevolucao, double kmDevolucao) {
		setAcrescimo(acrescimo);
		setAgenciaDevolução(agenciaDevolução);
		setDataDevolucao(dataDevolucao);
		setKmDevolucao(kmDevolucao);
	}

	public void devolver() {

	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public int getAgenciaDevolução() {
		return agenciaDevolução;
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

	public void setAgenciaDevolução(int agenciaDevolução) {
		this.agenciaDevolução = agenciaDevolução;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public void setKmDevolucao(double kmDevolucao) {
		this.kmDevolucao = kmDevolucao;
	}
}
