package practice;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/migratory-birds/problem
public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 1, 2, 3);
		Logger.print(migratoryBirds(a) + "");
	}

	public static int migratoryBirds(List<Integer> arr) {
		int maxBirdCount = 0;
		int theBird = 0;
		
		//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		if(map.containsKey(bird)) {
//			map.put(bird, map.get(bird) + 1);
//		}else {	
//			map.put(bird, map.get(bird));
//		}
		
		int birdCount[] = new int[5];  // each type is 1,2,3,4,5.
		for(int bird: arr) {
			birdCount[bird] = birdCount[bird] + 1;
		}     
		
		// 2, 2, 1
		for(int whichBird = 0; whichBird < birdCount.length; whichBird++) {
			if(birdCount[whichBird] > maxBirdCount) {
				maxBirdCount = birdCount[whichBird];
				theBird =  whichBird;
			}
		}
			
		return theBird;

	}

}
