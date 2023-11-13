package entidades;

import java.util.List;
import java.util.ArrayList;

public class Aluno implements Estuda{
	
	private String nome;
	private String matricula;
	private List<Curso> cursosPrincipais;
	private List<Curso> cursosSecundarios;
	
/*overload = ter dois construtores iguais e dependendo do qual parâmetro eu passe
ele chama determinado metodo*/
	
	public Aluno(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cursosPrincipais = new ArrayList<Curso>();
		this.cursosSecundarios = new ArrayList<Curso>();
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}
	
	public List<Curso> getCursosPrincipais(){
		return cursosPrincipais;
	}
	
	public void setcursosPrincipais( List<Curso> cursoPrincipais) {
		this.cursosPrincipais = cursosPrincipais;
	}

	public List<Curso> getCursosSecundarios() {
		return cursosSecundarios;
	}

	public void setCursosSecundarios(List<Curso> cursosSecundarios) {
		this.cursosSecundarios = cursosSecundarios;
	}
	
	public void addCursosPrincipais(Curso curso) {
		for (Curso dessaVez : cursosPrincipais)
			if(dessaVez.getNome() == curso.getNome())
				return;
		cursosPrincipais.add(curso);
	}
	
	public void addCursosSecundarios(Curso curso) {
		for(Curso daVez : cursosSecundarios)
		if(daVez.getNome() == curso.getNome())
			return;
		cursosSecundarios.add(curso);
		
/*verifica se o curso já existe na lista, se já existe apenas retorna
se não existe, adiciona. Esse for percorre a lista verificando*/
	}
	
	public void removerCursoSecundario( Curso paraRemover) {
		for(int indice = 0; indice < cursosSecundarios.size(); indice++) {
			if(cursosSecundarios.get(indice).getNome() == paraRemover.getNome()) {
				cursosSecundarios.remove(indice);
				return;
			}
		}
	}
	
	public boolean usaCaderno() {
		return false;
	}
	public int temCaderno() {
		return 1;
	}
}