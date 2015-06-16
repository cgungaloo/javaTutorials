package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mb = new MealBuilder();
		Meal veggie = mb.prepareVegMeal();
		
		System.out.println("Veggie Meal");
		veggie.showItems();
		System.out.println("Total Cost : " + veggie.getCost());
		
		Meal chicken = mb.prepareMeatMeal();
		System.out.println("Chicken Burger");
		chicken.showItems();
		System.out.println("Total Cost : " + chicken.getCost());
	}

}
