package com.automation.assignments;

public class Marks {

	public static void main(String[] args) {

		int[] Marks;
		Marks = new int[5];
		Marks[0] = 78;
		Marks[1] = 12;
		Marks[2] = 89;
		Marks[3] = 55;
		Marks[4] = 35;
		for (int i = 0; i < Marks.length; i++) {
			if (Marks[i] > 80) {
				System.out.println("Students marks above 80 : " + Marks[i]);
			}
		}

	}

}
