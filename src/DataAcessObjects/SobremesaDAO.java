package DataAcessObjects;

import java.util.HashMap;

import Entidades.Entidade;
import Entidades.Sobremesa;

public class SobremesaDAO extends EntidadeDAO{
	
	private static SobremesaDAO instance = null;
	HashMap<Integer, Sobremesa> db;
	
	private SobremesaDAO(){
		db = new HashMap<Integer,Sobremesa>();
	}
	
	public static SobremesaDAO getInstance(){
		if(instance == null){
			instance = new SobremesaDAO();
		}
		return instance;
	}

	public boolean salvaInstancia(Entidade e) {
		if(db.containsKey(e.getId())) return false;
		Sobremesa s = (Sobremesa)e;
		db.put(s.getId(), s);
		System.out.println(s.toString());
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
		
		Sobremesa s2 = (Sobremesa)e2;
		Sobremesa ref = db.get(e1.getId());
		
		ref.setSabor(s2.getSabor());
		ref.setTipo(s2.getTipo());
		ref.setPreco(s2.getPreco());
		
		return true;
	}

	@Override
	public boolean deletaInstancia(Entidade e) {
		if(!db.containsKey(e.getId())) return false;
		db.remove(e.getId());
		return true;
	}
	
}