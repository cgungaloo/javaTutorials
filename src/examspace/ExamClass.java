package examspace;

import java.util.ArrayList;

public class ExamClass {


	    private static void permutation(String prefix, String str){
	        int n = str.length();
	        char charati;
	        String sub;
	        if (n == 0) 
	            System.out.println(prefix);
	        else {
	            for (int i = 0; i < n; i++){
	            	charati= str.charAt(i);
	            	sub = str.substring(0, i)+ str.substring(i+1);
	                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
	            }
	        }
	    }
	    public static void main(String[] args) {
	        permutation("", "ABCD");
	    }
	
    
}
