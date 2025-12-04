package week5;

import java.util.Scanner;

public class eiBankLoan2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

//tính số tháng để trả hết số tiền
	public static void main(String[] args) {
		// cách 1
//		double x = sc.nextDouble(); // tiền gốc
//		double y = sc.nextDouble();
//		double r = sc.nextDouble();
//		double rate = r / 12 / 100;
		// double pay = 0;
		// double month = 0;
		// double maintain = x - y;
//		while (pay < x) {
//			pay += Math.round(y + (x - maintain) * rate);
//			month++;
//			maintain += y;
//		}
//			System.out.println(Math.round(month));
//	}
//Cách 2
//		double month = Math.log(y / (y - rate * x)) / Math.log(1 + rate);
//		System.out.println((long) Math.ceil(month));
		// cách 3
		double debt = sc.nextDouble();
		double monthlyPayment = sc.nextDouble();
		double r = sc.nextDouble();
		r = r / 12 / 100;
		long month = 0;
		while (debt > 0) {
			double interest = debt * r;
			double monthlyDebt = monthlyPayment - interest;
			debt -= monthlyDebt;
			month++;
		}
		System.out.println(month);
	}
}
