package examspace;

public class FactorialViaRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(RecursionFactorial(15));
		combo("","ABCD");
	}

	public static int RecursionFactorial(int n){
		if(n==1){
			return 1;
		}else{
			return n * RecursionFactorial(n-1);
		}
	}
	
	public static void combo(String prefix,String input){
		
		int len = input.length();
		if(len <1){
			System.out.println(prefix);
		}else{
			for(int x =0;x < len;x++){
				combo(prefix + input.charAt(x),input.substring(0,x) +input.substring(x+1));
			}
		}
	}
}
