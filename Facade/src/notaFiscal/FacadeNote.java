package notaFiscal;

public class FacadeNote {
	Sales products;
	Note note;
	Tax tax;
	
	public FacadeNote(Sales carenagem, Note direcao, Tax chassis) {
		this.products = carenagem;
	    this.note = direcao;
	    this.tax = chassis;
	}
	
	public void generateNote() {
		tax.getTaxes();
		note.calculateNote();
		products.getProducts();
	}	
}
