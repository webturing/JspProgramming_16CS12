package dp.lec12.factory.p2;
public class BlueBallPen extends BallPen {
	public PenCore getPenCore() {
		return new BluePenCore();
	}
}