package model;

public class Starter {

	public static void main(String[] args) {
		PizzaTemplate m = new Margharita();
		PizzaTemplate ml = new MeatLoverz();
		PizzaTemplate cl = new CheezeLoverz();
		PizzaTemplate tm = new TexMex();
		
		PizzaTemplate[] tabPizza = {m, ml, cl, tm};
		
		System.out.println("I'm Making the 4 best pizza of my life !\n");
		
		for (PizzaTemplate pizza : tabPizza) {
			pizza.makePizza();
			System.out.println("Pizza is Ready !!!!");
		}
		
//		m.makePizza();
//		ml.makePizza();
//		cl.makePizza();
//		tm.makePizza();
	}

}
