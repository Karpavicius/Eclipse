
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough() {
		return new ThickCrustDough();
	};
    
	public Sauce createSauce() {
    	return new PlumTomatoSauce();
    };
    
    public Cheese createCheese() {
    	return new MozzarellaCheese();
    };
    
    public Clam createClam() {
    	return new FrozenClams();
    };
}
