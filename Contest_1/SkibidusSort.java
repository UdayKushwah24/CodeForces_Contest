package CodeForces.Contest_1;
import java.io.*;
import java.util.*;

public class SkibidusSort {
    public static void main(String[] args) throws IOException {
        BufferedReader ReadBuffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder meraOutput = new StringBuilder();
        
        int t = Integer.parseInt(ReadBuffer.readLine()); // Number of test cases

        while (t-- > 0) {
            String[] nm = ReadBuffer.readLine().split(" ");
            int n = Integer.parseInt(nm[0]); // Size of array a
            int m = Integer.parseInt(nm[1]); // Always 1

            int[] a = new int[n];
            String[] aStr = ReadBuffer.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(aStr[i]);
            } 
            int b1 = Integer.parseInt(ReadBuffer.readLine().trim());
 
            List<Integer> possibleValues = new ArrayList<>();
            for (int ai : a) {
                possibleValues.add(Math.min(ai, b1 - ai));
                possibleValues.add(Math.max(ai, b1 - ai));
            } 
            Collections.sort(possibleValues);
            boolean SortKardo = true;
            for (int i = 1; i < possibleValues.size(); i++) {
                if (possibleValues.get(i) < possibleValues.get(i - 1)) {
                    SortKardo = false;
                    break;
                }
            } 
            meraOutput.append(SortKardo ? "YES\n" : "NO\n");
        } 
        System.out.print(meraOutput);
    }
}