package dp.lec12.factory.p01.best;
public class Factory {
	public static Fruit createFruit(String ClassName) {
		Fruit fruit = null;
		try {
			fruit = (Fruit) Class.forName(ClassName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fruit;
	}
}
