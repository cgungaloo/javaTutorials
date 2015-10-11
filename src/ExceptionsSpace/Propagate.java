package ExceptionsSpace;

public class Propagate {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		try{
			System.out.println(reverse(""));
		}finally{
			System.out.println("Program has finsihed");
		}
		
	}
	
	static String reverse (String input) throws CustomException{
		String reversal = " ";
		if(input.length() ==0){
			throw new CustomException();
		}else{
			
			for(int i = input.length()-1; i>=0;i--){
				reversal += input.charAt(i);
			}
		}
		return reversal;
	}

}
