package examspace;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X =5;
		int [] A ={1,2,1,4,2,3,5,4};
		
		Arrays.sort(A);
		int s = solution(X,A);
		System.out.println(s);
		
		Arrays.sort(A);
		for(int a :A){
			System.out.println(a);
		}
	}

	public static int solution(int X, int[] A) {
        // write your code in Java SE 8
		int[] path = new int[X];
		int actualpath =0;
		for(int j =1; j<=X;j++){
			path[j-1] =j;
			//System.out.println(path[j-1]);
		}
		
		for(int i =0; i < A.length ;i++){
			if(A[i] ==X && i==0){
				return 1;
			}else if(A[i] ==X){
				for(int a : path){
					int index =0;
					while(index <= i){
						if(a ==A[index]){
							actualpath++;
							break;
						}else{
							index++;
						}
					}
				}
				if(actualpath == X){
					return i;
				}
			}
		}
		 return -1;
	}

}
