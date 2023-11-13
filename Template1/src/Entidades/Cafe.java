package Entidades;

public class Cafe extends BebidaCafeinada{

	@Override
    public void mistura(){
        System.out.println("Moendo café");
    }
	
	@Override
    public void addCondimentos(){
        System.out.println("Adicionando açúcar e leite");
    }
}