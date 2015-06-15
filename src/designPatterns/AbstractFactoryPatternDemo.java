package designPatterns;

public class AbstractFactoryPatternDemo {
	public static void main(String args[]){
		FactoryProducer fp = new FactoryProducer();
		
		AbstractFactory shape = fp.getFactory("shape");
		Shape circle = shape.getShape("circle");
		circle.draw();
		
		AbstractFactory color = fp.getFactory("color");
		Color red = color.getColor("red");
		red.fill();
	}
}
