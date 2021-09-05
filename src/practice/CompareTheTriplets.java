package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(5, 6, 7);
		List<Integer> b = Arrays.asList(3, 6, 10);
		List<Integer> c = compareTriplets(a, b);
		Logger.print(c.toString());
	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int award1 = 0;
		int award2 = 0;
		int length = a.size();
		// O(n)
		// Space => 0(2)
		for (int i = 0; i < length; i++) {
			if (a.get(i) > b.get(i)) {
				award1++;
			}
			if (a.get(i) < b.get(i)) {
				award2++;
			}
		}
		return Arrays.asList(award1, award2);
	}

}
