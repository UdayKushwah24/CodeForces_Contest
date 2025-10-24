package CodeForces.Contest_6;
 
import java.util.Scanner;

public class BePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_len = sc.nextInt();
        while (arr_len-- > 0) {
            int size = sc.nextInt();
            int positiveArr[] = new int[size];
            for (int i = 0; i < positiveArr.length; i++) {
                positiveArr[i] = sc.nextInt();
            }
          
            int ans = 0;

            int countNegative = 0;
            int countZero = 0;
            for (int i = 0; i < positiveArr.length; i++) {
                if (positiveArr[i] == -1) {
                    countNegative++;
                } else if(positiveArr[i] == 0) {
                    countZero++;
                }
            }


           
            boolean flag = true;
            countNegative = countNegative % 2;
            if (countNegative == 1) {
                ans += 2;
                flag = false;
            }
            if (flag && countNegative % 2 == 1) {
                ans++;
            }

            ans += countZero;
            System.out.println(ans);

        }
        sc.close();
    }
}
