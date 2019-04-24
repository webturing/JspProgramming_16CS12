package dp.chainresponsibility.p02;
public class Application {
	private Handler	beijing, shanghai, tianjin;    // 责任链上的对象
	public void createChain() {       // 建立责任链
		beijing = new Beijing();
		shanghai = new Shanghai();
		tianjin = new Tianjin();
		beijing.setNextHandler(shanghai);
		shanghai.setNextHandler(tianjin);
	}
	public void reponseClient(String number) {  // 响应用户的请求
		beijing.handleRequest(number);
	}
	public static void main(String args[]) {
		Application application = new Application();
		application.createChain();
		application.reponseClient("77720810340930632");;
	}
}
