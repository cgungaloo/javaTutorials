package singletonPattern;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	
	//create private constructor so it cant be accessed
	private SingleObject(){};
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello World");
	}
}
