package Entidades;

import DataAcessObjects.EntidadeDAO;
import DataAcessObjects.SobremesaDAO;

public class Sobremesa extends Entidade{

	private String sabor;
	private String tipo;
	private String preco;
	
	public Sobremesa(){
		super();
		sabor = "";
		tipo = "";
		preco = "";
	}
	
	public Sobremesa (String sabor, String tipo, String preco){
		super();
		this.sabor = sabor;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	@Override
	public EntidadeDAO getDAO() {
		return SobremesaDAO.getInstance();
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String toString(){
		return "Sabor: " + sabor + "\nTipo: " + tipo + "\nPreço: " + preco;
	}
 	
}
