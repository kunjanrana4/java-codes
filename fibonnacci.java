
import java.util.*;
import java.lang.*;
import java.io.*;

class Fibonacci {

    public static void main(String[] args) {

        int num = 5,fib0=0, fib1=1,fib2;
        fib2 = fib0+fib1;
        System.out.println(fib0+"\n"+fib1);
        while(num-2 != 0) {
            System.out.println(fib2);
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib0+fib1;
            num--;   
        }
    }
}
