package dp.lec12.factory.p6;
public class Paracetamol extends Drug {
	String	part1	= "每粒含乙酰氨基酚";
	String	part2	= "每粒含咖啡因";
	String	part3	= "每粒含人工牛黄";
	String	part4	= "每粒含马来酸氯苯";
	public Paracetamol(String name, int[] a) {
		this.name = name;
		part1 = part1 + ":" + a[0] + "毫克\n";
		part2 = part2 + ":" + a[1] + "毫克\n";
		part3 = part3 + ":" + a[2] + "毫克\n";
		part4 = part4 + ":" + a[3] + "毫克\n";
		constitute = part1 + part2 + part3 + part4;
	}
}
