package entidades;

/*não pode ser instanciada, mas pode criar uma referencia para um objeto*/

public abstract class Pessoa {
	private String cpf;
	protected String nome; 
//sendo protected todas as filhas podem acessar
/*private static final String nome = "Evelin"; - Ele é final, não pode alterar
quando usar só static? quando usar só final?
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
//sem set pra cpf para não alterar

	public String getInfo() {
		return "cpf" + this.cpf + "nome" + this.nome;
	}
	public abstract void metodoAbstrataQualquer();
	//só pode ser feito em uma classe abstrata pq não pode instanciar
}
//sobrecarga de metodo
//sobrescrita epolimorfismo