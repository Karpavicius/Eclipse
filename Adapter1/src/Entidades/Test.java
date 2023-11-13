package Entidades;

public class Test{
	public static void main(String[] args) {
		MallardDuck mduck = new MallardDuck();
		WildTurkey wturkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(wturkey);
		
		System.out.println("WildTurkey:");
		wturkey.gobble();
		wturkey.fly();
		
		System.out.println("MallardDuck:");
		testDuck(mduck);
		
		System.out.println("AdaptadTurkey");
		testDuck(turkeyAdapter);
		
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
}