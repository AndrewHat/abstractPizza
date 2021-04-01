package model;

public class MeatLoverz extends PizzaTemplate {

	@Override
	protected
	void addCheeze() {
		System.out.println("No Cheeze! Only Meat!");

	}

	@Override
	protected
	void addTopping() {
		System.out.println("Putting in equal parts: Ground Beef, Slices of Pepperoni, Pieces of Chicken BBQ and Bacon!");
	}

}
