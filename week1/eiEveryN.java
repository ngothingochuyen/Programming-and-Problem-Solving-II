package week1;

import java.util.Scanner;

public class eiEveryN {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * nhập vào T testcase gồm chuỗi m phần tử và số n xét xem trong chuỗi có đủ giá
	 * trị từ 1 đến n không
	 */

	public static void main(String[] args) {
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] arr = inPut(m);
			arr = checkNumber(arr, n);
			if (checkContinous(arr))
				sb.append("Yes").append("\n");
			else
				sb.append("No").append("\n");
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

	// xét xem trong chuỗi có số từ 1-n không
	public static int[] checkNumber(int[] arr, int n) {
		int[] checkNumber = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1 && arr[i] <= n) {
				checkNumber[arr[i]]++;
			}
		}
		return checkNumber;
	}

	// check xem có liên tục từ 1-n không, nếu = 0 là tại vì trong chuỗi không có số
	// đó thỏa điều kiện từ 1-n
	public static boolean checkContinous(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] == 0)
				return false;
		}
		return true;
	}
}
