package CodeForces.Contest_3;

import java.util.Scanner;

public class Main {
	public static void meraFunction(Scanner sc) {
		int lambayi = sc.nextInt();

		 
		System.out.print(1 + " ");

		 
		for (int i = 3; i <= lambayi; i++) {
			System.out.print(i + " ");
		}

	 
		System.out.println(2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			meraFunction(sc);
		}

		sc.close();
	}

}