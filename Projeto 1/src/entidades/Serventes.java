package entidades;

public abstract class Serventes extends Pessoa{

	public Serventes(String cpf, String nome) {
		super(cpf, nome);
	}

	public abstract void cozinhar();
}
