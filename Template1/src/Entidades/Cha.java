package Entidades;

public class Cha extends BebidaCafeinada{

	@Override
    public void mistura(){
        System.out.println("Preparando o saquinho de ch�");
    }

	@Override
    public void addCondimentos(){
        System.out.println("Adicionando algumas gotas de lim�o");
    }
}
