package Entidades;
import java.util.Observable;

public class ComputingMagazine extends Observable{
	
	private int edition;
	
	public void setNewEdition(int NewEdition) {
		this.edition = NewEdition;
		
		setChanged();
		notifyObservers();
	}

	public int getEdition() {
		return this.edition;
	}
	
}