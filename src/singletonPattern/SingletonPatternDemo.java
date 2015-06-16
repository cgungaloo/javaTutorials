package singletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject so = SingleObject.getInstance();
		SingleObject so2 = SingleObject.getInstance();
		so.showMessage();
	}

}
