package model;

public class Pagamento {
	private String cpf;
	private String titularCartao;
	private double valor;

	public Pagamento() {

	}

	public Pagamento(String cpf, String titularCartao, double valor) {

		setCpf(cpf);
		setTitularCartao(titularCartao);
		setValor(valor);
		
	}

	public void efetuarPagamento() {

	}

	public String getCpf() {
		return cpf;
	}

	public String getTitularCartao() {
		return titularCartao;
	}

	public double getValor() {
		return valor;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTitularCartao(String titularCartao) {
		this.titularCartao = titularCartao;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

}
