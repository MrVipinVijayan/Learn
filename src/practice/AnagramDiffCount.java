package practice;

public class AnagramDiffCount {

	public static void main(String[] args) {
		
		int count = test("abcd", "dcbamaaa");
		Logger.print("Count = "+ count);

	}
	
	static int test(String str1, String str2) {
		
		int[] char_count = new int[26];
		
		for (int i = 0; i < str1.length(); i++) {
			char_count[str1.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			char_count[str2.charAt(i) - 'a']--;
		}
		
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (char_count[i] != 0) {
				count += Math.abs(char_count[i]);
			}
		}
		return count;
	}

}
