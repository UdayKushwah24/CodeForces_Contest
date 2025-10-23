package CodeForces.Contest_4;

import java.util.*;

public class Pathless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            pathSolveKaro(sc);
        }
        sc.close();
    }
    public static void pathSolveKaro(Scanner sc) {
        int n = sc.nextInt();
        long s = sc.nextLong();
        int[] gintiArr = new int[3];
        List<Integer> makkar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            gintiArr[val]++;
            makkar.add(val);
        }
        long puraJod = (long) gintiArr[1] + (long) gintiArr[2] * 2;
        if (s < puraJod) {
            for (int i = 0; i < n; i++) {
                System.out.print(makkar.get(i) + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        } else if (s == puraJod) {
            System.out.println(-1);
        } else {
            long bacha = s - puraJod;
            if (bacha == 1) {
                List<Integer> result = new ArrayList<>();
                for (int i = 0; i < gintiArr[0]; i++)
                    result.add(0);
                for (int i = 0; i < gintiArr[2]; i++)
                    result.add(2);
                for (int i = 0; i < gintiArr[1]; i++)
                    result.add(1);
                for (int i = 0; i < result.size(); i++) {
                    System.out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
