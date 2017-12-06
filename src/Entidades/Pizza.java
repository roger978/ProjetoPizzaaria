package Entidades;

import DataAcessObjects.EntidadeDAO;
import DataAcessObjects.PizzaDAO;

public class Pizza extends Entidade{

	private String sabor;
	private String tamanho;
	private String preco;
	
	public Pizza(){
		super();
		sabor = "";
		tamanho = "";
		preco = "";
	}
	
	public Pizza(String sabor, String tamanho, String preco){
		super();
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	@Override
	public EntidadeDAO getDAO() {
		return PizzaDAO.getInstance();
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
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
		return "Sabor: " + sabor + "\nTamanho: " + tamanho + "\nPreço: " + preco;
	}
 	
}
