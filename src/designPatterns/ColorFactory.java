package designPatterns;

public class ColorFactory extends AbstractFactory{
	
	public Color getColor(String colorType){
		
		if(colorType.equals(null)){
			System.out.println("null colorType entered");
			return null;
		}
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		}else if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if(colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		
		System.out.println("Invalid colorType entered");
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
