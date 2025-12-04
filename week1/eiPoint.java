package week1;

import java.util.Scanner;

public class eiPoint {
	static Scanner sc = new Scanner(System.in);
	/*
	 * đổi điểm số -> điểm chữ >=90 ->A >=85 ->A- >=80 ->B+ >=75 ->B >=70 ->B- >=65
	 * ->C+ >=60 ->C >=55 ->C- >=53 ->D+ >=52 ->D >=50 ->D- >=0 ->F
	 */

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] numPoint = { 90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0 };
		String[] letterPoint = { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };
		for (int i = 0; i < numPoint.length; i++) {
			if (n >= numPoint[i]) {
				System.out.println(letterPoint[i]);
				break;
			}
		}
	}
}
