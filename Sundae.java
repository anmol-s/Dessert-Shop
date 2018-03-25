public class Sundae extends IceCream {

	double sWeight;
	String sTopping;
	int sToppingCost = 0;
	
	public Sundae(String sN, int sPPP, String sT, int sTC) {
		super(sN, sPPP);
		name = sN;
		sTopping = sT;
		sToppingCost = sTC;
		iceCreamPricePerPound = sPPP;
	}

	public int getCost() {
		return sToppingCost + iceCreamPricePerPound;
	}

}
