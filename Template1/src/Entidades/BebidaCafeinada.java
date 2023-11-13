package Entidades;

public abstract class BebidaCafeinada {
	 public final void preparar(){ /* O TEMPLATE METHOD */
	        esquentarAgua();
	        mistura();
	        colocarEmCopo();
	        addCondimentos();
	    }

	    public final void esquentarAgua(){
	        System.out.println("Esquentando água");
	    }

	    public abstract void mistura();

	    public final void colocarEmCopo(){
	        System.out.println("Colocando no copo");
	    }

	    public abstract void addCondimentos();
}
