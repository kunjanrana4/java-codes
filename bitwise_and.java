import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i,j,max=0, t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            max=0;
            for(i=1;i<n+1;i++){
                for(j=i+1;j<n+1;j++){
                    if((i&j) < k && max < (i&j))
                        max = (i&j);
                }
            }
            System.out.println(max);
        }

        scanner.close();
    }
}
