package padrao;

public class Teste {
	
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			Singleton s = Singleton.getInstance();
		}	
	}
}
