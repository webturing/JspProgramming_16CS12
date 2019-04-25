package dp.factory.p2;
public class BlackPenCore extends PenCore {
	BlackPenCore() {
		color = "黑色";
	}
	public void writeWord(String s) {
		System.out.println("写出" + color + "的字:" + s);
	}
}
