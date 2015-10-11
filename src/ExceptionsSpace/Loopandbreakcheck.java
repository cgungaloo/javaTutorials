package ExceptionsSpace;

public class Loopandbreakcheck {
	static int x =7;
	String name = "hello";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="";
		System.out.println(x);
		for(int y=0; y<3; y++){
			x++;
			switch(x){
			case 8: s+= "8 ";
			case 9: s+= "9 ";
			case 10: s+= "10 "; break;
			default: s += "d ";
			case 13: s+="13 ";
			
			}
		}
		
		String F = "Fred";
		System.out.println(F.substring(0,3));
		System.out.println(F.substring(1,4));
		
		for(int i =0, z=0; i<3; i++){
			
		}
	}

	static{
	 x++;
	}
}
