package designPatterns;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equals(null)){
			System.out.println("null choice given");
			return null;
		}
		
		if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}else if(choice.equalsIgnoreCase("SHAPE")){
			return new abstractShapeFactory();
		}
		
		System.out.print("Invalid Factory Choice");
		return null;
	}
}
