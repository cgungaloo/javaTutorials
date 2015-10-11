package examspace;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Ato-generated method stub
		int [] leaves = {1,3,1,4,2,8,5,4};
		int leafLength = leaves.length;
		int[] minOrder=new int[leafLength+1];
		int minOrderIndex =0;
		int target =5;
		int targetSum = (target *(target+1))/2;

		for(int leafNum =0; leafNum < leafLength; leafNum++){

			Arrays.sort(minOrder);
			if(Arrays.binarySearch(minOrder, leaves[leafNum])<0){
				if(leaves[leafNum] <= target){
				minOrder[0] = leaves[leafNum];

				System.out.println();
				if(IntStream.of(minOrder).sum()== targetSum){
					System.out.println("Answer is " +leafNum);
					break;
				}
				minOrderIndex++;
				}
			}
		}	
	}

}

////you can also use imports, for example:
////import java.util.*;
//import java.util.Arrays;
//import java.util.stream.IntStream;
////you can write to stdout for debugging purposes, e.g.
////System.out.println("this is a debug message");
//
//class Solution {
// public int solution(int X, int[] A) {
//     // write your code in Java SE 8
//     
//          int leafLength = A.length;
//		int[] minOrder=new int[leafLength+1];
//		int minOrderIndex =0;
//		int targetSum = (X *(X+1))/2;
//
//     if(Arrays.binarySearch(A, X)<0){
//         return -1;
//     }
//		for(int leafNum =0; leafNum < leafLength; leafNum++){
//
//			Arrays.sort(minOrder);
//			if(Arrays.binarySearch(minOrder, A[leafNum])<0){
//				if(A[leafNum] <= X){
//				minOrder[0] = A[leafNum];
//
//				if(IntStream.of(minOrder).sum()== targetSum){
//					return leafNum;
//				}
//				minOrderIndex++;
//				}
//			}
//		}
//		return -1;
// }
//}
