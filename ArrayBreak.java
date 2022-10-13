package com.automation.assignments;

public class ArrayBreak {

	public static void main(String[] args) {
		int[] Num;
		Num = new int[5];
		Num[0] = 12;
		Num[1] = 34;
		Num[2] = 66;
		Num[3] = 85;
		Num[4] = 900;

		for (int i = 0; i < Num.length; i++) {
			if (Num[i] == 85) {
				break;
			}

			System.out.println(Num[i]);
		}

	}

}
