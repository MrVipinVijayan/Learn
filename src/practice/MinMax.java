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
		Collections.sort(arr);
		long min = 0;
		long max = 0;
		long count = 0;
		int length = arr.size();
		for (int i = 0; i < length; i++) {
			if (count < 4) {
				min += arr.get(i);
				max += arr.get(length - i - 1);
			}
			count++;
		}
		Logger.print(min + " " + max);
	}

}
