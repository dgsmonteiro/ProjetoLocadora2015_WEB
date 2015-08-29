package model;

public class Usuario {
	private String nomeUsuario;
	private char permissao;
	private String senha;

	public Usuario(String nomeUsuario, String senha, char permissao) {
		setNomeUsuario(nomeUsuario);
		setSenha(senha);
		setPermissao(permissao);
	}

	public void efetuarLogin() {

	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public char getPermissao() {
		return permissao;
	}

	public String getSenha() {
		return senha;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public void setPermissao(char permissao) {
		this.permissao = permissao;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
