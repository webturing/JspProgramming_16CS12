/**
 * 
 */
package dp.lec12.factory.p01.best;
/**
 * @author Administrator
 */
public class Application {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit apple = Factory.createFruit("dp.lec12.factory.p01.best.Apple");
		Fruit orange = Factory.createFruit("dp.lec12.factory.p01.best.Orange");
		System.out.println(apple);
	}
}
