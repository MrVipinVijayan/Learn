package practice;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/simple-array-sum/problem
public class SimpleArraySum {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(5, 6, 7);
		Logger.print("Sum = " + simpleArraySum(a));
	}
	
	public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for(int element : ar){
            sum += element;
        }
        return sum;
    }

}
