package practice;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 1, 0, -1, -1);
		plusMinus(a);
	}

	public static void plusMinus(List<Integer> numbers) {

		int positives = 0;
		int negatives = 0;
		int zeroes = 0;

		for (int number : numbers) {
			if (number == 0) {
				zeroes++;
			}
			if (number < 0) {
				negatives++;
			}
			if (number > 0) {
				positives++;
			}
		}

		double size = numbers.size();
		double p = positives / size;
		double n = negatives / size;
		double z = zeroes / size;

		System.out.println(p);
		System.out.println(n);
		System.out.println(z);

	}

}
