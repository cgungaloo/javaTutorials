package designPatterns;

public class shapeFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		
		Shape s1 = sf.getShape("circle");
		s1.draw();
		Shape s2 = sf.getShape("square");
		s2.draw();
		Shape s3 = sf.getShape("rectangle");
		s3.draw();
	}

}
