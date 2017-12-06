package DataAcessObjects;

import java.util.HashMap;

import Entidades.Entidade;
import Entidades.Bebida;

public class BebidaDAO extends EntidadeDAO{
	
	private static BebidaDAO instance = null;
	HashMap<Integer, Bebida> db;
	
	private BebidaDAO(){
		db = new HashMap<Integer,Bebida>();
	}
	
	public static BebidaDAO getInstance(){
		if(instance == null){
			instance = new BebidaDAO();
		}
		return instance;
	}

	public boolean salvaInstancia(Entidade e) {
		if(db.containsKey(e.getId())) return false;
		Bebida b = (Bebida)e;
		db.put(b.getId(), b);
		System.out.println(b.toString());
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
		
		Bebida b2 = (Bebida)e2;
		Bebida ref = db.get(e1.getId());
		
		ref.setNome(b2.getNome());
		ref.setTipo(b2.getTipo());
		ref.setTamanho(b2.getTamanho());
		ref.setPreco(b2.getPreco());
		
		return true;
	}

	@Override
	public boolean deletaInstancia(Entidade e) {
		if(!db.containsKey(e.getId())) return false;
		db.remove(e.getId());
		return true;
	}
	
}