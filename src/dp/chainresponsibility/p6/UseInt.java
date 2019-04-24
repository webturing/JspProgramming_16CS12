package dp.chainresponsibility.p6;
public class UseInt implements Handler {
	private Handler	handler;		// 存放当前处理者后继的Hander接口变量
	private int		result	= 1;
	public void compuerMultiply(String number) {
		try {
			int n = Integer.parseInt(number);
			int i = 1;
			while (i <= n) {
				result = result * i;
				if (result <= 0) {
					System.out.println("超出我的能力范围,我计算不了");
					handler.compuerMultiply(number);
					return;
				}
				i++;
			}
			System.out.println(number + "的阶乘:" + result);
		} catch (NumberFormatException exp) {
			System.out.println(exp.toString());
		}
	}
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}
}
