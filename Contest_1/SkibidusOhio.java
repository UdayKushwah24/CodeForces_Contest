package CodeForces.Contest_1;
import java.util.*;

public class SkibidusOhio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();  
        
        while (t-- > 0) {
            String s = input.nextLine();
            System.out.println(getMinLength(s));
        }
        input.close();
    }
    
    public static int getMinLength(String s) {
        StringBuilder MyStringBuilder = new StringBuilder(s);
        boolean changed = true;
        
        while (MyStringBuilder.length() > 1 && changed) {
            changed = false;
            for (int i = 0; i < MyStringBuilder.length() - 1; i++) {
                if (MyStringBuilder.charAt(i) == MyStringBuilder.charAt(i + 1)) {
                    MyStringBuilder.deleteCharAt(i + 1);  
                    changed = true;
                    break;  
                }
            }
        }
        
        return MyStringBuilder.length();
    }
}
