package entidades;

public class FacadeMontadora {
	
	CarBody carenagem;
	SteeringSystem direcao;
	ChassisSystem chassis;
	WheelSystem rodas;
	
	public FacadeMontadora(CarBody carenagem, SteeringSystem direcao, ChassisSystem chassis, WheelSystem rodas) {
		super();
		this.carenagem = carenagem;
		this.direcao = direcao;
		this.chassis = chassis;
		this.rodas = rodas;
	}

	public void montarCarro() {
		chassis.addChassisSystem();
		rodas.addWheelSystem();
		direcao.addSteeringStstem();
		carenagem.addCarBody();
	}
}
