package dp.chainresponsibility.p02;
import java.util.ArrayList;
public class Beijing implements Handler {
	private Handler				handler;	// 存放当前处理者后继的Hander接口变量
	private ArrayList<String>	numberList; // 存放身份证号码的数组线性表
	Beijing() {
		numberList = new ArrayList<String>();
		numberList.add("11129812340930034"); // 这里使用模拟的身份证号码
		numberList.add("10120810340930632");
		numberList.add("22029812340930034");
		numberList.add("32620810340930632");
	}
	public void handleRequest(String number) {
		if (numberList.contains(number)) System.out.println("该人在北京居住");
		else {
			System.out.println("该人不在北京居住");
			if (handler != null) handler.handleRequest(number);      // 将请求传递给下一个处理者
		}
	}
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}
}