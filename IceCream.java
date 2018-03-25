public class IceCream extends DessertItem {
	String iceCreamName;
	int iceCreamPricePerPound;

	public IceCream(String iceCreamN, int iceCreamPPP) {
		name = iceCreamN;
		iceCreamPricePerPound = iceCreamPPP;
	}

	public int getCost() {
		return iceCreamPricePerPound;
	}

}
