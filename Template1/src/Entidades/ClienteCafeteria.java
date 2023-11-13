package Entidades;

public class ClienteCafeteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cafe cafe = new Cafe();
        Cha cha = new Cha();

        cafe.preparar();
        /*
          Esquentando água
          Moendo café
          Colocando no copo
          Adicionando açúcar e leite
        */

        cha.preparar();
        /*
          Esquentando água
          Preparando o saquinho de chá
          Colocando no copo
          Adicionando algumas gotas de limão
          */
	}
}
