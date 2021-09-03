package practice;

public class Staircase {

	public static void main(String[] args) {
		staircase(6);
	}

	public static void staircase(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				Logger.print("#");
			}
			Logger.print("\n");
		}
	}

}
