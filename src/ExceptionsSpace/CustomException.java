package ExceptionsSpace;

public class CustomException extends Exception{
 public CustomException(){
	 System.out.println("The length of the input String is 0");
 }
 public static void main(String [] args){
	 int x =1;
	 
	 if(++x == 5){
		 
	 }
	 
	 System.out.println(x);
 }
}
