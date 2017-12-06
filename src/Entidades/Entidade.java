package Entidades;

import DataAcessObjects.EntidadeDAO;

public abstract class Entidade {
	protected int id;
	private static int index = 0;
	
	public Entidade(){
		id = index++;
		System.out.println("Meu Id agora eh " + id);
	}
	
	public final int getId(){
		return id;
	}
	
	public abstract EntidadeDAO getDAO();

}
