package CodeForces.Contest_3;

import java.util.Scanner;

public class FalseAlarm {


	public static String Alarm(int[] arr, int n, int x) {



		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				break;
			}
			idx++;
		}


		for (int i = idx; i < n; i++) {
			 

			if (i > idx-1) {
				x--;
			}
			if (x < 0 && arr[i] != 0) {
				return "NO";
			}
		}
		return "YES";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Alarm(arr,n, x));
		}
		sc.close();
	}

	
}
