package strategyPattern;

/*
 * The strategy pattern is when you can change the execution of an algorithm at run time. This is classified as 
 * a behaviour pattern.
 * Various objects are created which represent different strategies.
 * A context object is used to perform a generic operation that is implemented by the strategy object it receives.
 * 
 */

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new operationAdd());
		int num1 =3;
		int num2 =5;
		
		System.out.println(num1 + " + "+num2 + " = " + context.executeStrategy(num1, num2)  );
		
		context =new Context(new operationSubtract());
		System.out.println(num1 + " - "+num2 + " = " + context.executeStrategy(num1, num2)  );
		
		context = new Context(new operationMultiply());
		System.out.println(num1 + " * "+num2 + " = " + context.executeStrategy(num1, num2)  );
	}

}
