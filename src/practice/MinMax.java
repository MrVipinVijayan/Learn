package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MinMax {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 3, 5, 7, 9);
		miniMaxSum(a);
	}

	public static void miniMaxSum(List<Integer> arr) {
		long min = arr.get(0);
		long max = 0;
		long sum = 0;
		long length = arr.size();
		for (int i = 0; i < length; i++) {
			min = Math.min(min, arr.get(i));
			max = Math.max(max, arr.get(i));
			sum += arr.get(i);
		}
		
		// O(n) - Runtime
		System.out.println((sum - max) + " " + (sum - min));
	}

}
