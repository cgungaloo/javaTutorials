package recursionPackage;

public class SimpleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//myRecursiveMethod(10);
			System.out.println(fibbi(0,1,0));
	}
	
	public static int myRecursiveMethod (int aVariable)  
	{  
	  System.out.println(aVariable);  
	  aVariable--;  
	  if (aVariable == 0)  
	    return 0;  
	  return myRecursiveMethod(aVariable);  
	}  

	public static int fibbi(int n1,int n2,int index){
		if(index < 40){
			return fibbi(n2,n2+n1,index+1);
		}else{
			return n1;
		}
	}
	
	public int bunnieEars(int bunnies){
		if(bunnies ==1){
			return 2;
		}else if(bunnies ==0){
			return 0;
		}
		if(bunnies % 2 ==0){
			return 3+ bunnieEars(bunnies -1);
		}else{
			return 2+ bunnieEars(bunnies -1);
		}

	}
}
