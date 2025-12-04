package week1;


import java.util.Scanner;

 public class eiuMadis {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tìm khoảng cách ngắn nhất từ a[j]-a[i] với a[j]>=a[i]
	 */

	public static void main(String[] args) {
		int n = sc.nextInt();
		long[] a = inPut(n);
		long minValue = a[0];
		long maxDis = a[0] - minValue;
		for (int i = 1; i < a.length; i++) {
			long currentDis = a[i] - minValue;
			maxDis = Math.max(currentDis, maxDis);
			minValue = Math.min(minValue, a[i]);
		}
		System.out.println(maxDis);

	}

	public static long[] inPut(int m) {
		long[] a = new long[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		return a;
	}

}
