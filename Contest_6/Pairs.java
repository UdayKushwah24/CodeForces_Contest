/* package CodeForces.Contest_6;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();
        while (arr_len-- > 0) {
            int size = sc.nextInt();
            int pair[] = new int[size];
            for (int i = 0; i < pair.length; i++) {
                pair[i] = sc.nextInt();
            }
            int ans[] = new int[size];
            for (int i = 0; i < ans.length; i++) {
                int max = 0;
                for (int j = i + 1; j < ans.length; j++) {
         
                    max = Math.max(max, Math.abs(pair[i] - pair[j]));
                }
            
                ans[i] = max;
            }
            
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < ans.length; i++) {
                min = Math.min(min, ans[i]);
            }
            System.out.println(min);
            // System.out.println(Arrays.stream(ans).min().getAsInt());

        }
        sc.close();
    }
}
 */


 package CodeForces.Contest_6;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();
        while (arr_len-- > 0) {
            int size = sc.nextInt();
            int pair[] = new int[size];
            for (int i = 0; i < pair.length; i++) {
                pair[i] = sc.nextInt();
            }
            Arrays.sort(pair); 
            int ans[] = new int[size/2];
            int j = 0;
            for (int i = 0; i < pair.length;) {
                int a = pair[i];
                i++;
                int b = pair[i];
                i++;
                ans[j] = Math.abs(a - b);
                j++;
            }

            

            System.out.println(Arrays.stream(ans).max().getAsInt());
            // System.out.println(min);
            
        }
        sc.close();
    }
}
