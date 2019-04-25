package dp.factory.p2;
public class Application {
	public static void main(String args[]) {
		PenCore penCore;
		BallPen ballPen = new BlueBallPen();
		penCore = ballPen.getPenCore();
		penCore.writeWord("你好,很高兴认识你");
		ballPen = new RedBallPen();
		penCore = ballPen.getPenCore();
		penCore.writeWord("How are you");
		ballPen = new BlackBallPen();
		penCore = ballPen.getPenCore();
		penCore.writeWord("nice to meet you");
	}
}
