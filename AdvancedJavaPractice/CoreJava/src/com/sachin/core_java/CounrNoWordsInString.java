package com.sachin.core_java;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CounrNoWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("   "+countDuplicateLetterInString("iyuataaiyuklmtm"));

	}

	public static String countDuplicateLetterInString(String str) {
		StringBuilder sb = new StringBuilder("");
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(entry.getValue());
		}
		return sb.toString();
	}

}
