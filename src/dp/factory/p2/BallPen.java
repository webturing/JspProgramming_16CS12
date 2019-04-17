package dp.lec12.factory.p2;
public abstract class BallPen {
	BallPen() {
		System.out.println("生产了一只装有" + getPenCore().color + "笔芯的圆珠笔");
	}
	public abstract PenCore getPenCore(); // 工厂方法
}
