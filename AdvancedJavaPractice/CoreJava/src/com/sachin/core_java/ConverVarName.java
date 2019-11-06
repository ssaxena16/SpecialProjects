package com.sachin.core_java;

public class ConverVarName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  " + modifiyVarName("myNameIsSachin"));

	}

	public static String modifiyVarName(String str) {
		String modifiedVar = "";
		if (str.contains("_")) {
			String[] token = str.split(str);
			for (int i = 0; i < token.length; i++) {
				if (i == 0) {
					modifiedVar = modifiedVar + token[i];
				} else {
					modifiedVar = modifiedVar + getFirstLetterCapString(token[i]);
				}
			}

		} else {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (isLowerCase(ch)) {
					modifiedVar = modifiedVar + ch;

				} else {
					modifiedVar = modifiedVar + "_" + getFirstLetterLowerString("" + ch);

				}

			}

		}
		return modifiedVar;
	}

	public static String getFirstLetterCapString(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static String getFirstLetterLowerString(String str) {
		return str.substring(0, 1).toLowerCase();
	}

	public static boolean isLowerCase(char ch) {

		return ("" + ch).toLowerCase().equals(("" + ch));

	}

}
