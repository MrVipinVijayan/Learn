package practice;

// https://www.hackerrank.com/challenges/staircase/problem
public class Staircase {

	public static void main(String[] args) {
		staircase(9);
	}

	public static void staircase(int n) {
		for(int i = 1; i < n + 1; i++) {
			for(int j = 0; j < i; j++) {
				Logger.print("#");
			}
			Logger.print("\n");
		}
	}

}
