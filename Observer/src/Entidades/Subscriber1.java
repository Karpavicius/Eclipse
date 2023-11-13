package Entidades;
import java.util.Observable;
import java.util.Observer;

public class Subscriber1 implements Observer{
	
	Observable computingMagazine;
	
	int NewEditionMagazine;
	
	public Subscriber1(Observable computingMagazine) {
		this.computingMagazine = computingMagazine;
		computingMagazine.addObserver(this);
	}
	
	@Override
	public void update(Observable computingMagSubject, Object arg1) {
		if(computingMagSubject instanceof ComputingMagazine) {
			ComputingMagazine computingMagazine = (ComputingMagazine) computingMagSubject;
			NewEditionMagazine = computingMagazine.getEdition();
			System.out.println("Attention, already arrived at another edition of Computing Magazine." + "This is your edition number: " + NewEditionMagazine);
		}
	}
}
