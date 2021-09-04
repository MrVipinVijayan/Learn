package practice;

import java.util.List;

// https://www.hackerrank.com/challenges/diagonal-difference/problem
public class DiagonalDifference {

	public static void main(String[] args) {
		//Logger.print(diagonalDifference(10, 20) + "");

	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int numberOfColumns = arr.size();
	    int numberOfRows = arr.get(0).size();
	    int sum1 = 0;
		int sum2 = 0;
		for(int row = 0; row < numberOfRows; row++) {
			for(int col = 0; col < numberOfColumns; col++) {
				if(row == col) {
					sum1 += arr.get(row).get(col);
				}
				if(row + col == numberOfRows - 1) {
					sum2 += arr.get(row).get(col);
				}
			}
		}
		return Math.abs(sum1 - sum2);
	}

}
