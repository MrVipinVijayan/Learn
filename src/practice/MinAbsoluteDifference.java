package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinAbsoluteDifference {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3, -7, 0);
		Logger.print(minimumAbsoluteDifference(a) + "");

	}

	public static int minimumAbsoluteDifference(List<Integer> arr) {

		Collections.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int length = arr.size();

        for (int i = 0; i < length - 1; i++) {
            int difference = Math.abs(arr.get(i + 1) - arr.get(i));
            
            if (difference < minDiff) {
                minDiff = difference;
            }
        }

        return minDiff;
	}

}
