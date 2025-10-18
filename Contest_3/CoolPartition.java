package CodeForces.Contest_3;

import java.io.*;
import java.util.*;

public class CoolPartition {
 
	static final int variable = (int) 1e9 + 7;

	static void meraFunction(Scanner sc) {
		int n = sc.nextInt();

		// Using 1-based indexing, so arrays length = n+2
		int[] arr = new int[n + 1];
		int[] nestArray = new int[n + 2];
		int[] lastArray = new int[n + 2];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
 	Arrays.fill(lastArray, variable);
 
		for (int i = n; i >= 1; i--) {
			nestArray[i] = lastArray[arr[i]];
			lastArray[arr[i]] = i;
		}

		int stithi = 1, answer = 0;
		while (stithi <= n) {
			int anthim = stithi;
			while (true) {
				int nn = 0;
				for (int i = stithi; i <= anthim; i++) {
					nn = Math.max(nn, nestArray[i]);
				}
				answer++;
				if (nn > n)
					break;
				stithi = anthim + 1;
				anthim = nn;
			}
			break;  
		}

		System.out.println(answer);
	}

	public static void main(String[] args) throws IOException {
 		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int i = 0; i < tests; i++) {
			meraFunction(sc);
		}
		sc.close();
	}
}