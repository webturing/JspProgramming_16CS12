/**
 * 
 */
package dp.lec12.factory.p01.better;
/**
 * @author Administrator
 */
public class Application {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit apple = Factory.createFruit("Apple");
		Fruit orange = Factory.createFruit("Orange");
	}
}
