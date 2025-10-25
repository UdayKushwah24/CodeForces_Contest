package CodeForces.Contest_7_17_October_2025;
 
import java.util.Scanner;

public class first {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            
            int n = sc.nextInt();                     
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(SubarrayAverage(arr, n));
        }


        sc.close();
    }

    private static int SubarrayAverage(int[] arr, int n) {
        // return Arrays.stream(arr).max().getAsInt();

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
        
    }
}
