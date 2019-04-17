package dp.lec12.factory.p2;
public class BlackBallPen extends BallPen {
	public PenCore getPenCore() {
		return new BlackPenCore();
	}
}