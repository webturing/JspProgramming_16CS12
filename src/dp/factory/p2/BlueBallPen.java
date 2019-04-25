package dp.factory.p2;
public class BlueBallPen extends BallPen {
	public PenCore getPenCore() {
		return new BluePenCore();
	}
}