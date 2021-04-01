package model;

public abstract class PizzaTemplate {
	// Pattern Template => garantie une séquence d'appel !

	public final void makePizza() {
		prepareDough();
		addTomatoSauce();
		addCheeze();
		addTopping();
		bake();
	}

	protected abstract void addCheeze();

	protected abstract void addTopping();

	private void bake() {
		System.out.println("Baking over 4000°C!!!\n");
	}

	private void addTomatoSauce() {
		System.out.println("Spreading sexy tomato sauce");
	}

	private void prepareDough() {
		System.out.println("Slamming and shaping the dough");
	}
}
