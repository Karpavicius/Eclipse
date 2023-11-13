package entidades;
//herança (extends)
public class Professores extends Pessoa implements Lecionar{

	private String disciplina;
	
	public Professores(String cpf, String nome, String disciplina) {
		super(cpf, nome);
		this.disciplina = disciplina;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getinfo() {
		String informacaoBasica = super.getInfo();
		return informacaoBasica;
	}

	public void ensinar() {
		
	}
	public boolean aplicarProva() {
		return true;
	}
	public void metodoAbstrataQualquer() {
	}
}
/*interface: contrato. Quem for implementar tem que seguir esse contrato*/