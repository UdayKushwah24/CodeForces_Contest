package CodeForces.Contest_1;

import java.util.*;

public class AmoguNouns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline
        
        while (t-- > 0) {
            String GivenString = sc.nextLine();
            
            // Convert singular noun to plural
            String bahuBachan = GivenString.substring(0, GivenString.length() - 2) + "i";
            System.out.println(bahuBachan);
        }
        sc.close();
    }
}
 