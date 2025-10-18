package CodeForces.Contest_1;
import java.util.*;

public class BroThinksHesHim {
    static final int MOD = 998244353;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int q = scanner.nextInt();
            int[] queries = new int[q];
            for (int i = 0; i < q; i++) {
                queries[i] = scanner.nextInt() - 1;
            }
            
            processQueries(s, queries);
        }
    }
    
    private static void processQueries(String s, int[] queries) {
        char[] arr = s.toCharArray();
        int fValue = computeF(arr);
        
        for (int flipIndex : queries) {
            // Flip the character
            arr[flipIndex] = arr[flipIndex] == '0' ? '1' : '0';
            
            // Update fValue based on the change
            fValue = updateF(arr, fValue, flipIndex);
            
            System.out.print(fValue + " ");
        }
        System.out.println();
    }
    
    private static int computeF(char[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        return count;
    }
    
    private static int updateF(char[] arr, int currentF, int index) {
        if (index > 0 && arr[index] != arr[index - 1]) {
            currentF++;
        } else if (index > 0 && arr[index] == arr[index - 1]) {
            currentF--;
        }
        
        if (index < arr.length - 1 && arr[index] != arr[index + 1]) {
            currentF++;
        } else if (index < arr.length - 1 && arr[index] == arr[index + 1]) {
            currentF--;
        }
        
        return (currentF + MOD) % MOD;
    }
}
