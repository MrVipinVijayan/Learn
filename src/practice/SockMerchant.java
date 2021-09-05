package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.io.*;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/sock-merchant/problem
public class SockMerchant {

	public static void main(String[] args) throws IOException {
		List<Integer> a = Arrays.asList(1, 2, 1, 2, 1, 1);
		Logger.print(sockMerchant(7, a) + "");
	}

	public static int sockMerchant(int n, List<Integer> socks) {
		int numPairs = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int sock : socks) {
			if (map.containsKey(sock)) {
				int val = map.get(sock);
				if (val % 2 == 0) {
					val = 0;
					numPairs++;
				}
				map.put(sock, val + 1);
			} else {
				map.put(sock, 0);
			}
		}

		return numPairs;

	}

}
