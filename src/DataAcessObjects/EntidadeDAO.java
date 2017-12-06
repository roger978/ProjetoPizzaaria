package DataAcessObjects;

import Entidades.Entidade;

public abstract class EntidadeDAO{
	public abstract boolean salvaInstancia(Entidade e); // Create
	public abstract Entidade consultaEntidade(int id); // Read
	public abstract boolean atualizaEntidade(Entidade e1, Entidade e2); // Update
	public abstract boolean deletaInstancia(Entidade e); // Delete
}
