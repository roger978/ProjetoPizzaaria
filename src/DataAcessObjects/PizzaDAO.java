package DataAcessObjects;

import java.util.HashMap;

import Entidades.Entidade;
import Entidades.Pizza;

public class PizzaDAO extends EntidadeDAO{
	
	private static PizzaDAO instance = null;
	HashMap<Integer,Pizza> db;
	
	private PizzaDAO(){
		db = new HashMap<Integer,Pizza>();
	}
	
	public static PizzaDAO getInstance(){
		if(instance == null){
			instance = new PizzaDAO();
		}
		return instance;
	}

	public boolean salvaInstancia(Entidade e) {
		if(db.containsKey(e.getId())) return false;
		Pizza p = (Pizza)e;
		db.put(p.getId(), p);
		System.out.println(p.toString());
		return true;
	}

	@Override
	public Entidade consultaEntidade(int id) {
		if(db.containsKey(id)){
			return db.get(id);
		}
		return null;
	}

	@Override
	public boolean atualizaEntidade(Entidade e1, Entidade e2) {
		
		if(!db.containsKey(e1.getId())) return false;
		
		Pizza p2 = (Pizza)e2;
		Pizza ref = db.get(e1.getId());
		
		ref.setSabor(p2.getSabor());
		ref.setTamanho(p2.getTamanho());
		ref.setPreco(p2.getPreco());
		
		return true;
	}

	@Override
	public boolean deletaInstancia(Entidade e) {
		if(!db.containsKey(e.getId())) return false;
		db.remove(e.getId());
		return true;
	}
	
}
