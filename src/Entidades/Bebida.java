package Entidades;

import DataAcessObjects.EntidadeDAO;
import DataAcessObjects.BebidaDAO;

public class Bebida extends Entidade{

	private String nome;
	private String tipo;
	private String tamanho;
	private String preco;
	
	public Bebida(){
		super();
		nome = "";
		tipo = "";
		tamanho = "";
		preco = "";
	}
	
	public Bebida (String nome, String tipo, String tamanho, String preco){
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	@Override
	public EntidadeDAO getDAO() {
		return BebidaDAO.getInstance();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String toString(){
		return "Nome: " + nome + "\nTipo: " + tipo + "\nTamanho: " + tamanho + "\nPreço: " + preco;
	}
 	
}
