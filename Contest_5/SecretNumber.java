package CodeForces.Contest_5;
import java.util.*;
public class SecretNumber { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> ans = new ArrayList<>();
 
            for (int k = 1; k <= 18; k++) {
                long d = (long) Math.pow(10, k) + 1; // 10^k + 1
                if (n % d == 0) {
                    ans.add(n / d);
                }
            }

            if (ans.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(ans);
                System.out.println(ans.size());
                for (int i = 0; i < ans.size(); i++) {
                    if (i > 0)
                        System.out.print(" ");
                    System.out.print(ans.get(i));
                }
                System.out.println();
            }
        }

        sc.close();
    }
}