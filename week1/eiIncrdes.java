package week1;

import java.util.Scanner;

public class eiIncrdes {
	// xét tăng, giảm hoặc k tăng k giảm
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = inPut(n);
		if (increasing(a))
			sb.append("increasing").append("\n");
		else {
			if (decreasing(a))
				sb.append("decreasing").append("\n");
			else
				sb.append("none").append("\n");
		}
		System.out.println(sb);
	}
	public static int[] inPut(int m) {
		int[] a = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static boolean increasing(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] <= a[i - 1])
				return false;
		}
		return true;
	}

	public static boolean decreasing(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] >= a[i - 1])
				return false;
		}
		return true;
	}

}
