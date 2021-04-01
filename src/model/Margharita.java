package model;

public class Margharita extends PizzaTemplate{

	@Override
	protected
	void addCheeze() {
		System.out.println("Gorgeous Mozzarella di Bufala");
		
	}

	@Override
	protected
	void addTopping() {
		System.out.println("Sprinkle of fresh basilic leaves");
		
	}

}
