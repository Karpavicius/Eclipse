
public abstract class Pizza {
	
	String name;
	
	Dough dough;    // massa 
	Sauce sauce;    // molho
	Cheese cheese;  // queijo
	Clam clam;      // moluscos
	
	abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350 degrees.");
	};
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices.");	
	}
	
	public void box() {
		System.out.println("Place pizza in official company box.\n");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
