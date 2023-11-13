package padrao;

public class Singleton {
	
	private static Singleton s = null;
	
	private Singleton() {
		System.out.println("Objeto criado.");
	}
	
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		else {
			System.out.println("Já estava criado.");
		}
		return s;
	}

}

