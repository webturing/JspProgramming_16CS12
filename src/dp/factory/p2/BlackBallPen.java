package dp.factory.p2;
public class BlackBallPen extends BallPen {
	public PenCore getPenCore() {
		return new BlackPenCore();
	}
}