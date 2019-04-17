package dp.lec12.factory.p6;
public class ParaDrugCreator implements DrugCreator {
	public Drug getDrug() {
		int[] a = {250, 15, 1, 10};
		Drug drug = new Paracetamol("氨加黄敏胶囊", a);
		return drug;
	}
}