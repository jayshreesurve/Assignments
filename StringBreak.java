package com.automation.assignments;

public class StringBreak {

	public static void main(String[] args) {

		String[] Tools = { "Java", "JavaScript", "Selenium", "Python", "Mukesh" };

		for (int i = 0; i <= Tools.length; i++) {
			if (Tools[i] == "Selenium") {
				break;
			}

			System.out.println(Tools[i]);
		}

	}

}
