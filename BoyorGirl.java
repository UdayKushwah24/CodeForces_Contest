
// https://codeforces.com/problemset/problem/236/A

package CodeForces;

import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int c = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            arr[ascii - 97]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                c++;
            }
        }
        if (c%2==0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
