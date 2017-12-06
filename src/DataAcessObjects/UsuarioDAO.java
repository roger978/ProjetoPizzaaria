package DataAcessObjects;

import java.util.HashMap;

import Entidades.Entidade;
import Entidades.Usuario;

public class UsuarioDAO extends EntidadeDAO{
	
	private static UsuarioDAO instance = null;
	HashMap<Integer,Usuario> db;
	
	private UsuarioDAO(){
		db = new HashMap<Integer,Usuario>();
	}
	
	public static UsuarioDAO getInstance(){
		if(instance == null){
			instance = new UsuarioDAO();
		}
		return instance;
	}

	public boolean salvaInstancia(Entidade e) {
		if(db.containsKey(e.getId())) return false;
		Usuario u = (Usuario)e;
		db.put(u.getId(), u);
		System.out.println(u.toString());
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
		
		Usuario u2 = (Usuario)e2;
		Usuario ref = db.get(e1.getId());
		
		ref.setAdministrator(u2.isAdministrator());
		ref.setNome(u2.getNome());
		ref.setSenha(u2.getSenha());
		ref.setSobrenome(u2.getSobrenome());
		ref.setUsuario(u2.getUsuario());
		
		return true;
	}

	@Override
	public boolean deletaInstancia(Entidade e) {
		if(!db.containsKey(e.getId())) return false;
		db.remove(e.getId());
		return true;
	}
	
}
