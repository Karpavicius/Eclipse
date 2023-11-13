package notaFiscal;

public class Test {
	public static void main(String[] args) {
		
		FacadeNote facade = new FacadeNote(new Sales(), new Note(), new Tax());
		facade.generateNote();
		
	}
	
	
}
