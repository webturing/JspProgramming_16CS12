package dp.lec12.factory.p6;
public class Application {
	public static void main(String args[]) {
		DrugCreator creator = new ParaDrugCreator();
		Drug drug = creator.getDrug();
		System.out.println(drug.getName() + "的成份:");
		System.out.println(drug.getConstitute());
		creator = new AmorDrugCreator();
		drug = creator.getDrug();
		System.out.println(drug.getName() + "的成份:");
		System.out.println(drug.getConstitute());
	}
}
