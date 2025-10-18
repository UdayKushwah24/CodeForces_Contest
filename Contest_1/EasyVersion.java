package CodeForces.Contest_1;

import java.util.*;
public class EasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int b1 = sc.nextInt();

            List<Integer> possibleValues = new ArrayList<>();
            for (int ai : a) {
                possibleValues.add(Math.min(ai, b1 - ai));
                possibleValues.add(Math.max(ai, b1 - ai));
            }

             
            Collections.sort(possibleValues);
            boolean isSorted = true;
            for (int i = 1; i < possibleValues.size(); i++) {
                if (possibleValues.get(i) < possibleValues.get(i - 1)) {
                    isSorted = false;
                    break;
                }
            }
 
            output.append(isSorted ? "YES\n" : "NO\n");
        }

         
        System.out.print(output);
 
        sc.close();
    }
}