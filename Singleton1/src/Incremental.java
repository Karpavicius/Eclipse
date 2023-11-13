public class Incremental {
	
	private static Incremental uniqueIncremental = null;
	
	
	private static int count = 0;
	private int numero;
	
	private Incremental() {
		numero = ++count;
	}
	
	public static Incremental getinstence() {
		if(uniqueIncremental==null) {
			uniqueIncremental = new Incremental();
		}
		return uniqueIncremental;
	}
	
	public String toString() {
		return "Incremental " + numero;
	}
}
