package week1;

import java.util.Scanner;

public class eiMone {
	static Scanner sc = new Scanner(System.in);
	/*
	 * đổi n số tiền và xuất ra số tờ của các mệnh giá 20,10,5,1; nếu mệnh giá nào
	 * có số tờ = 0 => không xuất
	 */

	public static void main(String[] args) {
		int n = sc.nextInt();
		int [] arr = {20,10,5,1};
		for (int i=0;i<arr.length;i++) {
			int temp = n/arr[i];
			if(temp>0) {
				System.out.println(arr[i]+" "+temp);
				n%=arr[i];
			}
		}
	}
}
