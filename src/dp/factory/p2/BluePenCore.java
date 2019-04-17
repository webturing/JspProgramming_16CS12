package dp.lec12.factory.p2;
public class BluePenCore extends PenCore {
	BluePenCore() {
		color = "蓝色";
	}
	public void writeWord(String s) {
		System.out.println("写出" + color + "的字:" + s);
	}
}
