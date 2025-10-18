package CodeForces.Contest_3;
import java.util.*;
public class Retailation {

/* 	public static boolean isValidSequence(int[] seq) {
		int len = seq.length;

		int diff = seq[1] - seq[0];
		for (int i = 2; i < len; i++) {
			if (seq[i] - seq[i - 1] != diff) {
				return false;
			}
		}

		int value = seq[0] - diff;
		int divisor = len + 1;

		if (value < 0 || value % divisor != 0) {
			return false;
		}

		int y = value / divisor;
		int x = diff + y;

		return x >= 0 && y >= 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		StringBuilder resultBuilder = new StringBuilder();

		for (int t = 0; t < testCases; t++) {
			int size = Integer.parseInt(sc.nextLine());
			String[] parts = sc.nextLine().split(" ");
			int[] sequence = new int[size];
			for (int i = 0; i < size; i++) {
				sequence[i] = Integer.parseInt(parts[i]);
			}

			if (isValidSequence(sequence)) {
				resultBuilder.append("YES\n");
			} else {
				resultBuilder.append("NO\n");
			}
		}

		System.out.print(resultBuilder);
		sc.close();
	} */



	public static boolean isValidSequence(int[] seq) {
	int len = seq.length;

	int diff = seq[1] - seq[0];
	for (int i = 2; i < len; i++) {
		if (seq[i] - seq[i - 1] != diff) {
			return false;
		}
	}

	int value = seq[0] - diff;
	int divisor = len + 1;

	if (value < 0 || value % divisor != 0) {
		return false;
	}

	int y = value / divisor;
	int x = diff + y;

	return x >= 0 && y >= 0;
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCases = Integer.parseInt(sc.nextLine());
	StringBuilder resultBuilder = new StringBuilder();

	for (int t = 0; t < testCases; t++) {
		int size = Integer.parseInt(sc.nextLine());
		String[] parts = sc.nextLine().split(" ");
		int[] sequence = new int[size];
		for (int i = 0; i < size; i++) {
			sequence[i] = Integer.parseInt(parts[i]);
		}

		if (isValidSequence(sequence)) {
			resultBuilder.append("YES\n");
		} else {
			resultBuilder.append("NO\n");
		}
	}

	System.out.print(resultBuilder);
	sc.close();
}
}