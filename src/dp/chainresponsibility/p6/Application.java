package dp.chainresponsibility.p6;
public class Application {
	private Handler	useInt, useLong, useBig;	// 责任链上的对象
	public void createChain() { // 建立责任链
		useInt = new UseInt();
		useLong = new UseLong();
		useBig = new UseBigInteger();
		useInt.setNextHandler(useLong);
		useLong.setNextHandler(useBig);
	}
	public void reponseClient(String number) { // 响应用户的请求
		useInt.compuerMultiply(number);
	}
	public static void main(String args[]) {
		Application application = new Application();
		application.createChain();
		application.reponseClient("32");
	}
}