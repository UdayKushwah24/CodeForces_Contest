package CodeForces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (((a == 1 && b == 1) && (c == 1
                    && b == 1))||(a == 1 && b == 1) || (b == 1 && c == 1) || (a == 1 && c == 1)) {
                ans += 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
