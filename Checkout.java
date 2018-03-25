import java.util.ArrayList;

public class Checkout {
	
	ArrayList<DessertItem> listOfDesserts = new ArrayList<DessertItem>();
	int tCost = 0;
	

	public Checkout() {
	}

	public int totalCost() {
		return tCost + totalTax();
	}

	public int totalTax() {
		return (int)(tCost*DessertShoppe.TAX_RATE*0.01);
	}

	public int numberOfItems() {
		return listOfDesserts.size();
	}

	public void enterItem(Candy candy) {
		listOfDesserts.add(candy);
		tCost += candy.getCost();
	}

	public void clear() {
		listOfDesserts.clear();
		tCost = 0;
	}

	public java.lang.String toString() {
		String sT;
		String receipt = "        M & M Dessert Shoppe\n";
		receipt += "        --------------------\n";
		
		//for(int i = 0)
		//{
		//	sT = 
		//}
		
		int dnamespace = 28;
		int space = 0;
		String spaces = "";
		for(DessertItem dessert : listOfDesserts)
		{
			spaces = "";
			space = dnamespace - dessert.getName().length();
			for(int i = 0; i <= space; i++)
				spaces += " ";
			receipt += dessert.getName() + spaces + dessert.getCost()*.01 + "\n";
		}
		
		receipt += "\nTax" + "                          " + totalTax()*.01 + " \n";
		receipt += "Total Cost" + "                  " + totalCost()*.01;
		return receipt;
		
		/*for(int i = 0; i < numberOfItems(); i++)
			receipt += listOfDesserts.get(i).getName() + "\t" + listOfDesserts.get(i).getCost() + "\n";
		receipt += "\nTax\t\t" + totalTax() + " \n";
		receipt += "Total Cost\t" + totalCost() + "\n";
		return receipt;*/
	} 

	public void enterItem(Cookie cookie) {
		listOfDesserts.add(cookie);
		tCost += cookie.getCost();
	}

	public void enterItem(Sundae sundae) {
		listOfDesserts.add(sundae);
		tCost += sundae.getCost();
	}

	public void enterItem(IceCream iceCream) {
		listOfDesserts.add(iceCream);
		tCost += iceCream.getCost();
	}
}
