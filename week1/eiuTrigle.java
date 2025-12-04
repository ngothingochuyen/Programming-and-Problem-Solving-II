package week1;

import java.util.Arrays;
import java.util.Scanner;

public class eiuTrigle {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tìm xem trong chuỗi có bao nhiêu tam giác có thể tạo thành từ 3 phần tử trong
	 * chuỗi, a+b>c
	 */

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = inPut(n);
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int z = j + 1; z < arr.length; z++) {
					if (arr[i] + arr[j] > arr[z] && arr[j] + arr[z] > arr[i] && arr[z] + arr[i] > arr[j])
						count++;

				}
			}
		}
		System.out.println(count);

	}

	public static int[] inPut(int m) {
		int[] a = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
