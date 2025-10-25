package CodeForces.Contest_7_17_October_2025;

import java.util.Scanner;

public class BeautifulXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            long input_a = sc.nextLong();

            long input_b = sc.nextLong();
            if (input_a == input_b) {
                System.out.println(0);
                continue;
            }

            long calculate_x = input_a ^ input_b;
            if (calculate_x <= input_a) {
                System.out.println(1);
                System.out.println(calculate_x);
                continue;
            }

            long calculate_x1 = calculate_x / 2;
            long calculate_x2 = calculate_x - calculate_x;

            if (calculate_x1 <= input_a && calculate_x2 <= input_a && ((input_a ^ calculate_x1 ^ calculate_x2) == input_b)) {
                System.out.println(2);
                System.out.println(calculate_x1 + " " + calculate_x2);
            } else {
                System.out.println(-1);
            }

        }

        sc.close();
    }

}
