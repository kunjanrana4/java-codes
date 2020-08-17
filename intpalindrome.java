//Check if number is palindrome
import java.util.*;
import java.lang.*;
import java.io.*;

class Intpalindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=123454321,digit=0,reverse=0;
		int temp=n;
		while(n!=0){
		    digit = n%10;
		    reverse = reverse*10+digit;
		    n=n/10;
		}
		if(reverse == temp){
		    System.out.println("Number is palindrome");
		}
		else
		    System.out.println("Number is not palindrome.");
	}
}
