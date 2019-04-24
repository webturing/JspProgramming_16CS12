package dp.chainresponsibility.joke;
public class SmartGirl implements Girl {
	@Override
	public String toString() {
		// TODO just to demo
		return "I am so smart!";
	}
	private Girl	prev;
	@Override
	public void read(String letter) {
		if (letter.contains("smart")) System.out.println(this.toString() + " I love it!");
		else {
			System.out.println(this.toString() + " I dislike it!");
			if (prev != null) prev.read(letter);
		}
	}
	@Override
	public void setPrevGirl(Girl handler) {
		this.prev = handler;
	}
}
