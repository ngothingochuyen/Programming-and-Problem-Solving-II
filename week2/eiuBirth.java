package week2;

import java.util.Scanner;

public class eiuBirth {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính số tiền ít nhất để mua B quà xanh giá X và R quà đỏ giá Y, nếu mắc hơn
	 * có thể đổi bằng cách cộng thêm Z
	 */

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T != 0) {
			long B = sc.nextInt();
			long R = sc.nextInt();
			long X = sc.nextInt();
			long Y = sc.nextInt();
			long Z = sc.nextInt();
			T--;
			sb.append(payment(B, R, X, Y, Z)).append("\n");
		}
		System.out.println(sb);
	}

	public static long payment(long B, long R, long X, long Y, long Z) {
			X = Math.min(X, Y + Z);
			Y = Math.min(Y, X + Z);
		return (long)(B * X) + (long)(R * Y);

	}
}
