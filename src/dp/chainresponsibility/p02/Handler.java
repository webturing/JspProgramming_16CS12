package dp.chainresponsibility.p02;
public interface Handler {
	public abstract void handleRequest(String number);
	public abstract void setNextHandler(Handler handler);
}