import DataAcessObjects.UsuarioDAO;
import Entidades.Usuario;

public class Main {
	public static void main(String[] args){
		
		Usuario u = new Usuario();
		u.setNome("Joao");
		u.setSobrenome("da Silva");
		u.setUsuario("joaosilva");
		u.setSenha("senha");
		
		Usuario u2 = new Usuario();
		u2.setNome("Maria");
		u2.setSobrenome("Joaquina");
		u2.setUsuario("mariajoaquina");
		u2.setSenha("senha");
		
		UsuarioDAO ud = (UsuarioDAO) u.getDAO();
		ud.salvaInstancia(u);
		ud.salvaInstancia(u2);
		
		Usuario r = (Usuario)ud.consultaEntidade(0);
		System.out.println("Nome = " + r.getNome());
		
		Usuario r2 = (Usuario)ud.consultaEntidade(1);
		System.out.println("Nome = " + r2.getNome());
		
	}
}
