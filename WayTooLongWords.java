// https://codeforces.com/problemset/problem/71/A

package CodeForces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String s = sc.next();
            int len = s.length();
            if (len <= 10) {
                System.out.println(s);
            } else {
                String ans = "";
                ans += s.charAt(0) ;
                ans +=  (len - 2)  ;
                ans +=  s.charAt(len - 1);
                System.out.println(ans);
            }
            n--;
        }
    }
}
