package Entidades;

public class Main {

	public static void main(String[] args) {
		
		int NewEdition = 3;
		
		ComputingMagazine computingMagazine = new ComputingMagazine();
		Subscriber1 subscriber1 = new Subscriber1(computingMagazine);
		
		computingMagazine.setNewEdition(NewEdition);
		
	}

}
