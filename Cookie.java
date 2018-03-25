public class Cookie extends DessertItem {
	String coName;
	int coPricePerPound;
	int coNumber;
	
	public Cookie(String coN, int coNum, int coPPP) {
		name = coN;
		coPricePerPound = coPPP;
		coNumber = coNum;
	}

	public int getCost() {
		return (int)(coPricePerPound * coNumber / 12);
	}

}
