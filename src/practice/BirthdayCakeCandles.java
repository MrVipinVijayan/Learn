package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;	

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(18, 90, 90, 13, 90, 75, 90, 8, 90, 43);
		Logger.print(birthdayCakeCandles(a) + "");
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		if(null==candles || candles.isEmpty()) {
			return 0;
		}
		
		int tallCandleCount = 0;
		int max = -1;
		
		Collections.sort(candles, Collections.reverseOrder());
		
		for(int candleHeight : candles) {
			if(max != -1 && max != candleHeight) {
				break;
			}
			tallCandleCount++;
			max = candleHeight;
		}
		return tallCandleCount;
	}

}
