package dp.lec12.factory.p01.better;
public class Factory {
	public static Fruit createFruit(String string) {
		if (string.equals("Apple")) return new Apple();
		if (string.equals("Orange")) return new Apple();
		return null;
	}
}
