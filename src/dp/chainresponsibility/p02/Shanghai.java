package dp.chainresponsibility.p02;
import java.util.ArrayList;
public class Shanghai implements Handler {
	private Handler				handler;	// 存放当前处理者后继的Hander接口变量
	private ArrayList<String>	numberList; // 存放身份证号码的数组线性表
	Shanghai() {
		numberList = new ArrayList<String>();
		numberList.add("34529812340930034"); // 这里使用模拟的身份证号码
		numberList.add("98720810340430632");
		numberList.add("36529812340930034");
		numberList.add("77720810340930632");
	}
	public void handleRequest(String number) {
		if (numberList.contains(number)) System.out.println("该人在上海居住");
		else {
			System.out.println("该人不在上海居住");
			if (handler != null) handler.handleRequest(number);      // 将请求传递给下一个处理者
		}
	}
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}
}