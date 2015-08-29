package model;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.AcessoBD;

public class Cliente {

	private String bairro;
	private String cep;
	private String cidade;
	private String cnh;
	private String complemento;
	private String cpf;
	private String dataNascimento;
	private String email;
	private String logradouro;
	private String nome;
	private String num;
	private String primeiraCNH;
	private String rg;
	private String sexo;
	private String telefone;
	private String celular; 
	private String uf;
	private String ufCNH;
	private String validadeCNH;
	private int idCliente;
	public Connection conn = null;
	


	

	public Cliente(String bairro, String cep, String cidade, String cnh,
			String complemento, String cpf, String dataNascimento,
			String email, String logradouro, String nome, String num,
			String primeiraCNH, String rg, String sexo, String telefone,String celular,
			String uf, String ufCNH, String validadeCNH) {
		setBairro(bairro);
		setCep(cep);
		setCidade(cidade);
		setCnh(cnh);
		setComplemento(complemento);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setEmail(email);
		setLogradouro(logradouro);
		setNome(nome);
		setNum(num);
		setPrimeiraCNH(primeiraCNH);
		setRg(rg);
		setSexo(sexo);
		setTelefone(telefone);
		setCelular(celular);
		setUf(uf);
		setUfCNH(ufCNH);
		setValidadeCNH(validadeCNH);
		
		
	}
	
	public Cliente() {
	
		
	}



public void incluir(String bairro, String cep, String cidade, String cnh,
		String complemento, String cpf, String dataNascimento,
		String email, String logradouro, String nome, String num,
		String primeiraCNH, String rg, String sexo, String telefone,String celular,
		String uf, String ufCNH, String validadeCNH) throws SQLException {
		
		dao.ClienteDAO cliente = new dao.ClienteDAO();
		dao.AcessoBD bd = new dao.AcessoBD();
		conn = bd.obtemConexao();
		
		conn.setAutoCommit(false);
		
		cliente.incluir(conn, bairro,cep,cidade,cnh,complemento,cpf,dataNascimento,email,logradouro,nome,num,primeiraCNH,rg,sexo,telefone,celular,uf,ufCNH,validadeCNH);
		conn.commit();
		 

	}
	
	public void alterar(String bairro, String cep, String cidade, String cnh,
			String complemento, String cpf, String dataNascimento,
			String email, String logradouro, String nome, String num,
			String primeiraCNH, String rg, String sexo, String telefone,String celular,
			String uf, String ufCNH, String validadeCNH) throws SQLException {
		
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ClienteDAO cliDAO = new dao.ClienteDAO();
	
	
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
	
		cliDAO.alterar(conn,bairro, cep,  cidade, cnh, complemento,  cpf,  dataNascimento,
			 email,  logradouro,  nome,  num,
			 primeiraCNH,  rg,  sexo,  telefone, celular,
			 uf,  ufCNH, validadeCNH);
		conn.commit();
		
	}

	public Cliente consultar(String cpf) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ClienteDAO cliente = new dao.ClienteDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		return cliente.carregar(conn,cpf);
	}
	



	public void excluir(String cpf) throws SQLException {
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ClienteDAO cliente = new dao.ClienteDAO();
		conn =  bd.obtemConexao();
		conn.setAutoCommit(false);
		cliente.excluir(conn,cpf);
		conn.commit();
      
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCnh() {
		return cnh;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNome() {
		return nome;
	}

	public String getNum() {
		return num;
	}

	public String getPrimeiraCNH() {
		return primeiraCNH;
	}

	public String getRg() {
		return rg;
	}

	public String getSexo() {
		return sexo;
	}

	public String getTelefone() {
		return telefone;
	}
	
	public String getCelular(){
		return celular;
	}

	public String getUf() {
		return uf;
	}

	public String getUfCNH() {
		return ufCNH;
	}

	public String getValidadeCNH() {
		return validadeCNH;
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setPrimeiraCNH(String primeiraCNH) {
		this.primeiraCNH = primeiraCNH;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setCelular(String celular){
		this.celular=celular;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setUfCNH(String ufCNH) {
		this.ufCNH = ufCNH;
	}

	public void setValidadeCNH(String validadeCNH) {
		this.validadeCNH = validadeCNH;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


}
