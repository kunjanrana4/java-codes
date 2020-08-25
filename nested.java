import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int date_e, date_a, month_e, month_a, year_e, year_a, fine; 

        String[] in = scanner.nextLine().split(" ");
        date_a = Integer.parseInt(in[0]);
        month_a = Integer.parseInt(in[1]);
        year_a = Integer.parseInt(in[2]);

        in = scanner.nextLine().split(" ");
        date_e = Integer.parseInt(in[0]);
        month_e = Integer.parseInt(in[1]);
        year_e = Integer.parseInt(in[2]);

        if(year_a == year_e)
            if(month_a == month_e)
                if(date_a <= date_e)
                    fine = 0;
                else
                    fine = (date_a - date_e)*15;
            else if(month_a < month_e)
                fine = 0;
            else
                fine = (month_a - month_e)*500;
        else if(year_a > year_e)
            fine = 10000;
        else
            fine=0;
        
        System.out.print(fine);
        scanner.close();
    }
}

