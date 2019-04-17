package dp.lec12.factory.p6;
public class AmorDrugCreator implements DrugCreator {
	public Drug getDrug() {
		int[] a = {200, 5};
		Drug drug = new Amorolfine("甲硝唑胶囊", a);
		return drug;
	}
}