package dp.lec12.factory.p6;
public class Amorolfine extends Drug {
	String	part1	= "每粒含甲硝唑";
	String	part2	= "每粒含人工牛黄";
	public Amorolfine(String name, int[] a) {
		this.name = name;
		part1 = part1 + ":" + a[0] + "毫克\n";
		part2 = part2 + ":" + a[1] + "毫克\n";
		constitute = part1 + part2;
	}
}
