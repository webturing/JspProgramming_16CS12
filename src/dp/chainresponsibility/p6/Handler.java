package dp.chainresponsibility.p6;
public interface Handler {
	public abstract void compuerMultiply(String number);
	public abstract void setNextHandler(Handler handler);
}
