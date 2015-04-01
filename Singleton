 
public class Singleton {
 	// reason to use volatile http://stackoverflow.com/questions/2423622/volatile-vs-static-in-java
	private volatile Singleton instance = null;
 
	protected Singleton() {
	}
 
	// Lazy Initialization (If required then only)
	public static Singleton getInstance() {
		if (instance == null) {
			// Thread Safe. Might be costly operation in some case
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
