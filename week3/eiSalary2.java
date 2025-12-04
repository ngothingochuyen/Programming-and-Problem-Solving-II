package week3;

import java.util.Scanner;

public class eiSalary2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính lương, lương trung bình mỗi giờ của N người, lương tăng ca trung bình
	 * của N người
	 */

	public static void main(String[] args) {
		int n = sc.nextInt();
		double salary = 0, salaryOff = 0, salaryOver = 0, sumSalaryOff = 0, sumSalaryOver = 0, avgSalary = 0,
				avgOver = 0, sumOff = 0, sumOver = 0;
		for (int i = 1; i <= n; i++) {
			double[] hour = input();
			double officeHour = 0,overHour = 0; // giờ làm overtime
			for (int j = 0; j < hour.length - 1; j++) {
				if (hour[j] <= 8)
					officeHour += hour[j];
				else {
					overHour += hour[j] - 8;
					officeHour += 8;
				}
			}
			salaryOver = overHour * hour[5] * 1.5;
			salaryOff = officeHour * hour[5];
			salary = salaryOff + salaryOver;
			sb.append(salary).append("\n");
			sumOff += officeHour;
			sumOver += overHour;
			sumSalaryOff += salaryOff;
			sumSalaryOver += salaryOver;
		}
		if (sumOff > 0)
			avgSalary = sumSalaryOff / sumOff;
		else
			avgSalary = 0;
		if (sumOver > 0)
			avgOver = sumSalaryOver / sumOver;
		else
			avgOver = 0;
		System.out.print(sb);
		System.out.printf("%.2f\n%.2f", avgSalary, avgOver);
	}

	public static double[] input() {
		double[] a = new double[6];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		return a;
	}
}
