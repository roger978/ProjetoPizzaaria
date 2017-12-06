package Entidades;

import java.util.ArrayList;

import DataAcessObjects.EntidadeDAO;

public class Pedido extends Entidade {

	private Usuario pedinte;
	private ArrayList<Pizza> pizzas;
	private ArrayList<Bebida> bebidas;
	private ArrayList<Sobremesa> sobremesas;
	private double precoTotal;
	private boolean concluido;
	
	/* Construtores */
	
	public Pedido(){
		super();
		this.pedinte = null;
		this.pizzas = new ArrayList<Pizza>();
		this.bebidas = new ArrayList<Bebida>();
		this.sobremesas = new ArrayList<Sobremesa>();
		this.precoTotal = 0;
		this.concluido = false;
	}

	public Pedido(Usuario pedinte){
		super();
		this.pedinte = pedinte;
		this.pizzas = new ArrayList<Pizza>();
		this.bebidas = new ArrayList<Bebida>();
		this.sobremesas = new ArrayList<Sobremesa>();
		this.precoTotal = 0;
		this.concluido = false;
	}
	
	public Pedido(Pedido pedido){
		this.id = pedido.id;
		this.pedinte = pedido.pedinte;
		this.bebidas = pedido.bebidas;
		this.sobremesas = pedido.sobremesas;
		this.precoTotal = pedido.precoTotal;
		this.concluido = pedido.concluido;
	}
	
	public Pedido(Usuario pedinte, ArrayList<Pizza> pizzas, ArrayList<Bebida> bebidas, ArrayList<Sobremesa> sobremesas, double precoTotal, boolean concluido){
		super();
		this.pedinte = pedinte;
		this.bebidas = bebidas;
		this.sobremesas = sobremesas;
		this.precoTotal = precoTotal;
		this.concluido = concluido;
	}
	
	/* Cálculos */

	public void calculaPrecoTotal(){
		double preco = 0;
		
		for(Pizza p : pizzas){
			preco += Double.parseDouble(p.getPreco());
		}
		
		for(Bebida b : bebidas){
			preco += Double.parseDouble(b.getPreco());
		}
		
		for(Sobremesa s : sobremesas){
			preco += Double.parseDouble(s.getPreco());
		}
		
		this.precoTotal = preco;
	}
	
	/* Getters e Setters */
	
	public Usuario getPedinte() {
		return pedinte;
	}

	public void setPedinte(Usuario pedinte) {
		this.pedinte = pedinte;
	}

	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public ArrayList<Sobremesa> getSobremesas() {
		return sobremesas;
	}

	public void setSobremesas(ArrayList<Sobremesa> sobremesas) {
		this.sobremesas = sobremesas;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	@Override
	public EntidadeDAO getDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
