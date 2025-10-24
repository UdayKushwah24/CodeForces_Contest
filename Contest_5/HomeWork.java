package CodeForces.Contest_5;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int len_a = sc.nextInt();
            String a = sc.next();

            int len_b = sc.nextInt();
            String b = sc.next();
            String c = sc.next();
            String ans = HW(len_a, a, len_b, b, c);
            System.out.println(ans);
        }
        sc.close();
    }

    

    private static String HW(int len_a, String a, int len_b, String b, String c) {
        StringBuilder vlad = new StringBuilder();
        StringBuilder Dima = new StringBuilder();
        for (int i = 0; i < len_b; i++) {
            char ch = c.charAt(i);
            char ch_b = b.charAt(i);
            if (ch == 'V') {
                vlad.insert(0, ch_b);
            } else {
                Dima.append(ch_b);
            }
        }
        return vlad.toString() + a + Dima.toString();
    }
}
