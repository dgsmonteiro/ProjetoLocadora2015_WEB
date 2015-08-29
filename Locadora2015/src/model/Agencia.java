package model;

public class Agencia {

	private String cidade;
	private int codigo;
	private String estado;
	private String nome;

	public Agencia(String cidade, int codigo, String estado, String nome) {
		setCidade(cidade);
		setCodigo(codigo);
		setEstado(estado);
		setNome(nome);
	}

	public void consultar() {

	}

	public String getCidade() {
		return cidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getEstado() {
		return estado;
	}

	public String getNome() {
		return nome;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
