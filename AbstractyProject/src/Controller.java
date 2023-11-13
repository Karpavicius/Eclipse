
public class Controller {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYStylePizzaStore();
		Pizza pizza1 = nyStore.orderPizza("cheese");
		Pizza pizza2 = nyStore.orderPizza("clam");
		
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		Pizza pizza3 = chicagoStore.orderPizza("cheese");
		Pizza pizza4 = chicagoStore.orderPizza("clam");
	}
}
