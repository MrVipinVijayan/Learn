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
		List<Integer> awards = new ArrayList<Integer>(2);
		awards.add(0);
		awards.add(0);
		int length = a.size();
		for (int i = 0; i < length; i++) {
			if (a.get(i) > b.get(i)) {
				awards.set(0, awards.get(0) + 1);
			}
			if (a.get(i) < b.get(i)) {
				awards.set(1, awards.get(1) + 1);
			}
		}
		return awards;
	}

}
