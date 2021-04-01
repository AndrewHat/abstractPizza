package model;

public class CheezeLoverz extends PizzaTemplate {

	@Override
	protected
	void addCheeze() {
		System.out.println(
				"Putting in equal parts: Slice of Mozzarella, Pieces of Gorgonzola, Grated Parmgiano Reggiano and Cheddar!");
	}

	@Override
	protected
	void addTopping() {
		System.out.println("No Toppings! Only Cheeze!");

	}

}
