package LambdasLab;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DiscountListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<BigDecimal> prices = Arrays.asList(
				new BigDecimal("10"),new BigDecimal("20"),new BigDecimal("31"),
				new BigDecimal("45"),new BigDecimal("46"),new BigDecimal("56")
				);
		
		final BigDecimal finalPrice = prices.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) >0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println(finalPrice);
		
		Function<Integer, Integer> func = y -> y * 2;

		// Apply the function to an argument of 10.
		int result = func.apply(10);
		System.out.println(result);
		
		int j = 0/5;
		System.out.println(j);
	}
	
	
}
