package recursionPackage;

import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<String> combos = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(solution(213));
		
		
	}
	
	public static int solution(int N) {
        // write your code in Java SE 8
		String nAsString = String.valueOf(N);
		
		permutation("",nAsString);
		int max =0;
		int numToTest;
		for (String num :combos){
			numToTest = Integer.parseInt(num);
			if(numToTest > max){
				max = numToTest;
			}
		}
		return max;
    }
	
	public static void permutation(String prefix, String str){
        int n = str.length();
        char charati;
        String sub;
        if (n == 0) {
            System.out.println(prefix);
        	combos.add(prefix);
        }else {
            for (int i = 0; i < n; i++){
            	charati= str.charAt(i);
            	System.out.println(charati);
            	sub = str.substring(0, i)+ str.substring(i+1);
            	System.out.println(sub);
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
            }
        }
    }

}
