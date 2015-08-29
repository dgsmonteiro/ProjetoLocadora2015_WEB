package model;

public class Credito extends Pagamento {
	private String codigoSegurancaCartao;
	private String numeroCartao;
	private String tipoCartao;
	private String validadeCartao;

	public Credito() {

	}

	public Credito(String codigoSegurancaCartao, String numeroCartao,
			String tipoCartao, String validadeCartao) {
		setCodigoSegurancaCartao(codigoSegurancaCartao);
		setNumeroCartao(numeroCartao);
		setTipoCartao(tipoCartao);
		setValidadeCartao(validadeCartao);
	}

	public String getCodigoSegurancaCartao() {
		return codigoSegurancaCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setCodigoSegurancaCartao(String codigoSegurancaCartao) {
		this.codigoSegurancaCartao = codigoSegurancaCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public void validarPagamento() {

	}
}
