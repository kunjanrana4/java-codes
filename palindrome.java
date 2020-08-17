//Check if string is palindrome
import java.util.*;
import java.lang.*;
import java.io.*;

class palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "malayalam",rev="";
		for(int i=s.length()-1;i>=0;i--){
		   rev = rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)){
		    System.out.println("String is palindrome.");
		}
		else
		    System.out.println("String is not palindrome.");
	}
}
