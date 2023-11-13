package projeto_1;

import entidades.Aluno;
import entidades.Curso;
import entidades.Estuda;
import entidades.Lecionar;
import entidades.Pessoa;
import entidades.Professores;

public class Main {

	public static void main(String[] args) {
/*static = não precisa criar um objeto pra chamar e
Pessoa pessoa = new Pessoa("1232212", "Lucas");*/
		Professores professor  = new Professores("123455", "Lucas", "POO");
		Curso agronomia = new Curso("agronomia");
		Curso ads = new Curso("ads");
		Aluno aluno1 = new Aluno("123", "nome");
		Aluno aluno2 = new Aluno("1234", "nome");
		Aluno aluno3 = new Aluno("12345", "nome");
		aluno1.addCursosPrincipais(ads);
		aluno2.addCursosSecundarios(agronomia);
		aluno3.addCursosSecundarios(agronomia);
		
		Lecionar l1 = professor;
		Estuda e2 = aluno1;
		
		System.out.println(l1.aplicarProva());
		System.out.println(e2.temCaderno());
	}
}
/*Revisão Maven e Versionamento (mais teoria): dependencia: usar outras bibliotecas; se não tem gerenciador precisa colocar
 o executavel da biblioteca; Maven: repositorio de bibliotecas; Não precisa e não deve versionar o .jar, quer versionar só texto
 dois principais: Maven (usado) e Gradle; ajudam a gerar o executavel final; 
 versionamento (git):
 */