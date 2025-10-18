package CodeForces.Contest_3;

import java.util.Scanner;

public class Shrink {
/* 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();

		while (test_cases-- > 0) {
			int len = sc.nextInt();
			int[] my_result = new int[len];

			int lower_value = 1, higher_value = len;
			for (int i = 0; i < len; i++) {
				if (i % 2 == 0) {
					my_result[i] = lower_value++;
				} else {
					my_result[i] = higher_value--;
				}
			}

			for (int i = 0; i < len; i++) {
				System.out.print(my_result[i] + " ");
			}
			System.out.println();
		}
		sc.close();
	} */


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();

	while (t-- > 0) {
		int lambai = sc.nextInt();
		int[] ans = new int[lambai];

		int low = 1, high = lambai;
		for (int i = 0; i < lambai; i++) {
			if (i % 2 == 0) {
				ans[i] = low++;
			} else {
				ans[i] = high--;
			}
		}

		for (int i = 0; i < lambai; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}
	sc.close();
}
}