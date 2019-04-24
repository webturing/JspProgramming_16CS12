package dp.chainresponsibility.p6;
public class UseLong implements Handler {
	private Handler	handler;		// 存放当前处理者后继的Hander接口变量
	private long	result	= 1;
	public void compuerMultiply(String number) {
		try {
			long n = Long.parseLong(number);
			long i = 1;
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
