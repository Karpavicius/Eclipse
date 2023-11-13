package entidades;

/*n�o pode ser instanciada, mas pode criar uma referencia para um objeto*/

public abstract class Pessoa {
	private String cpf;
	protected String nome; 
//sendo protected todas as filhas podem acessar
/*private static final String nome = "Evelin"; - Ele � final, n�o pode alterar
quando usar s� static? quando usar s� final?
regra ser sempre private, no final, no static*/
	
	public Pessoa(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
//sem set pra cpf para n�o alterar

	public String getInfo() {
		return "cpf" + this.cpf + "nome" + this.nome;
	}
	public abstract void metodoAbstrataQualquer();
	//s� pode ser feito em uma classe abstrata pq n�o pode instanciar
}
//sobrecarga de metodo
//sobrescrita epolimorfismo