package practice;

import java.util.List;

public class CountApplesOranges {

	public static void main(String[] args) {
	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

		int numApples = 0;
		int numOranges = 0;

		for (int apple : apples) {
			apple = apple + a;
			if (apple >= s && apple <= t) {
				numApples++;
			}
		}

		for (int orange : oranges) {
			orange = orange + b;
			if (orange >= s && orange <= t) {
				numOranges++;
			}
		}

		Logger.print(numApples + "\n" + numOranges);

	}

}
