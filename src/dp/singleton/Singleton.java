package dp.singleton;

public class Singleton {
	private static Singleton unique =  new Singleton();

	private Singleton() {

	}

	public synchronized Singleton getInstance() {

		return unique;

	}
}
