package CodeForces;

import java.util.Scanner;
 

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n-- > 0) {
            String s = sc.next(); // use next() instead of nextLine()
            if (s.equals("++X") || s.equals("X++")) {
                ans++;
            } else {
                ans--;
            }
        }
        System.out.println(ans);
    }
}
