package entidades;

public class CarroFinalizado {

	public static void main(String[] args) {
		
		FacadeMontadora facade = new FacadeMontadora(new CarBody(), new SteeringSystem(), new ChassisSystem(), new WheelSystem());
		
		facade.montarCarro();
	}	
		
}
