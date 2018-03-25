public class Candy extends DessertItem {
	String cName;
	double cWeight;
	int cPricePerPound;
	
	public Candy(String cN, double cW, int cPPP) {
		name = cN;
		cWeight = cW;
		cPricePerPound = cPPP;
	}

	public int getCost() {
		return (int)(cPricePerPound * cWeight + .5);
	}

}
