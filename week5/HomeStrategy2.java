package week5;

import java.util.Scanner;

public class HomeStrategy2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính mỗi tháng trả bao nhiêu để đủ mua nhà
	 */

	public static void main(String[] args) {
		int months = sc.nextInt();
		long price = sc.nextLong();
		double r = sc.nextDouble(); // lai xuat vay ngan hang
		double[] houseInceaseRate = new double[9];
		for (int i = 1; i < houseInceaseRate.length; i++) {
			houseInceaseRate[i] = sc.nextDouble();
		}
		double[] savingRate = new double[9];
		for (int i = 1; i < savingRate.length; i++) {
			savingRate[i] = sc.nextDouble();
		}

		// System.out.println(Arrays.toString(houseInceaseRate));
		// System.out.println(Arrays.toString(savingRate));

		// tiet kiem tien cho den khi duoc 30%
		double high = 1e12;
		double low = 0;
		double mid = 0;

		while (low + 1e-6 < high) {
			mid = (high + low) / 2;

			double saving = mid;
			int count = 0;
			int indexRate = 1;
			double tempPrice = price * 1.0;
			// double bonus =0;

			double debt = 0;
			for (int i = 1; i <= months; i++) {

				if (saving >= tempPrice * 0.3) {

					debt = tempPrice - saving;
					count = i + 1;
					break;
				}

				saving = saving * (1 + savingRate[indexRate]) + mid;
				// saving += mid;
				tempPrice *= (1 + houseInceaseRate[indexRate]);
				if (i % 60 == 0)
					indexRate++;

			}
			for (int i = count; i <= months; i++) {
				debt = debt * (1 + r) - mid;
				// debt -= mid;
			}
			if (debt > 0)
				low = mid;
			else
				high = mid;
		}
		System.out.println((long) Math.round(mid));
	}
}
