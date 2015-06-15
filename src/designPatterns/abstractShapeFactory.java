package designPatterns;

public class abstractShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equals("null")){
			System.out.println("No Shape type defined");
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		
		System.out.println("Invalid Shape type");
		return null;
	}

}
