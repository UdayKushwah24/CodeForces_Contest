package CodeForces.Contest_4;

import java.util.Arrays;
import java.util.Scanner;

public class SubmissionIsAllYouNeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            SubmissionNeed(arr);
        }
        sc.close();
    }
    private static void SubmissionNeed(int[] arr) {
        int[] countArrElement = new int[55];  

        for (int value : arr) {
            countArrElement[value]++;
        }

        long ans = 0;
 
        int cnt2 = Math.min(countArrElement[0], countArrElement[1]);
        ans += cnt2 * 2L;
        countArrElement[0] -= cnt2;
        countArrElement[1] -= cnt2;
 
        ans += countArrElement[0];
        countArrElement[0] = 0;
 
        for (int i = 0; i < 55; i++) {
            if (countArrElement[i] > 0) {
                ans += (long) i * countArrElement[i];
            }
        }

        System.out.println(ans);
    }
}

 