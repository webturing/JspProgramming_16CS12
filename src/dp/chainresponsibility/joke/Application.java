package dp.chainresponsibility.joke;
public class Application {
	Girl[]	girls;
	void createChain() {
		girls = new Girl[4];
		girls[0] = new BeautifulGirl();
		girls[1] = new CuteGirl();
		girls[2] = new SmartGirl();
		girls[3] = new RobustGirl();
		for (int i = 0; i < girls.length - 1; i++) {
			girls[i].setPrevGirl(girls[i + 1]);
		}
	}
	public void tryToFindAGirlFriend(String loveLetter) { // 响应用户的请求
		girls[0].read(loveLetter);
	}
	public static void main(String[] args) {
		Application app = new Application();
		String loveLetter = "I am happy boy, nice to meet you!";
		app.createChain();
		app.tryToFindAGirlFriend(loveLetter);
	}
}
