package com.sachin.important_programs;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abcaadeeyipeeijaamkhh";
		char[] ch = st.toCharArray();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (hs.add(ch[i])) {
			} else {
				if (map.containsKey(ch[i])) {
					int a1 = map.get(ch[i]);
					map.remove(ch[i]);
					map.put(ch[i], ++a1);

				} else {
					map.put(ch[i], 1);
				}
			}

		}
		st = "";
		for (Character ch1 : hs) {
			st = st + ch1;
		}
		System.out.println(st);
		System.out.println(map);

	}

}
