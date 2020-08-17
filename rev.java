import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseNumber {

    public static void main(String[] args) {

        int num = 1123, rev = 0;

        while(num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        System.out.println(rev);
    }
}
