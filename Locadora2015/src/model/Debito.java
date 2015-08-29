package model;

public class Debito extends Pagamento {
	private String agencia;
	private String banco;
	private String contaCorrente;
	private String telefone;

	
	public Debito() {

	}

	public Debito(String agencia, String banco, String contaCorrente,
			String telefone) {
		super();
		setAgencia(agencia);
		setBanco(banco);
		setContaCorrente(contaCorrente);
		setTelefone(telefone);
	}

	public String getAgencia() {
		return agencia;
	}

	public String getBanco() {
		return banco;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void validarPagamento() {

	}
}
