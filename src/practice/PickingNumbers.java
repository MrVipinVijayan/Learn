package practice;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/picking-numbers/problem
public class PickingNumbers {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);
		Logger.print(pickingNumbers(a) + "");
	}

	public static int pickingNumbers(List<Integer> a) {
		int maxSubArrayLength = Integer.MIN_VALUE;
		int frequency[] = new int[101];

		int length = a.size();
		for (int i = 0; i < length; i++) {
			frequency[a.get(i)]++;
		}

		for (int i = 1; i <= 100; i++) {
			maxSubArrayLength = Math.max(maxSubArrayLength, frequency[i] + frequency[i - 1]);
		}

		return maxSubArrayLength;
	}

}
