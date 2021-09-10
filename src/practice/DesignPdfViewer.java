package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class DesignPdfViewer {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7);
		Logger.print(designerPdfViewer(a, "abc") + "");
	}

	public static int designerPdfViewer(List<Integer> h, String word) {

		int maxHeight = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int count = 0;
		for (char character = 'a'; character <= 'z'; character++) {
			map.put(character, h.get(count));
			count++;
		}

		for (char character : word.toCharArray()) {
			int height = map.get(character);
			maxHeight = Math.max(maxHeight, height);
		}

		return maxHeight * word.length();

	}
}
