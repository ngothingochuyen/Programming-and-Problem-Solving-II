package week3;


import java.util.Scanner;

 public class eiDinRate2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long c = 0;
		while (n > 0) {
			double N = sc.nextDouble();
			double L = sc.nextDouble();
			double M = sc.nextDouble();
			c = 0;
			while (N < M) {
				N *=((L/100)+1);
				c++;
			}
			n--;
			System.out.println(c);
		}
		sc.close();
	}
}
