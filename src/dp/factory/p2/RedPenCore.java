package dp.lec12.factory.p2;
public class RedPenCore extends PenCore {
	RedPenCore() {
		color = "红色";
	}
	public void writeWord(String s) {
		System.out.println("写出" + color + "的字:" + s);
	}
}
