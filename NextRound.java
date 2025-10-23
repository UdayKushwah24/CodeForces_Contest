package CodeForces;

import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int cutoff = a[k - 1]; // score of k-th participant
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= cutoff && a[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
