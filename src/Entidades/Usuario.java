package Entidades;

import java.util.ArrayList;

import DataAcessObjects.EntidadeDAO;
import DataAcessObjects.UsuarioDAO;

public class Usuario extends Entidade{

	private String nome;
	private String sobrenome;
	private String usuario;
	private String senha;
	private ArrayList<Pedido> historico;
	private boolean administrator;
	
	/* Construtores */
	
	public Usuario(){
		super();
		nome = "";
		sobrenome = "";
		usuario = "";
		senha = "";
		historico = new ArrayList<Pedido>();
		administrator = false;
	}
	
	public Usuario(Usuario usuario){
		this.id = usuario.id;
		this.nome = usuario.nome;
		this.sobrenome = usuario.sobrenome;
		this.usuario = usuario.usuario;
		this.senha = usuario.senha;
		this.historico = usuario.historico;
		this.administrator = usuario.administrator;
	}
	
	public Usuario(String nome, String sobrenome, String usuario, String senha, boolean administrator){
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.usuario = usuario;
		this.senha = senha;
		historico = new ArrayList<Pedido>();
		this.administrator = administrator;
	}
	
	/* Getters e Setters */
	
	@Override
	public EntidadeDAO getDAO() {
		return UsuarioDAO.getInstance();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}
	
	public String toString(){
		return "Nome = " + nome + ", Sobrenome = " + sobrenome + ", Usuario = " + usuario + ", Senha = " + senha;
	}
 	
}
