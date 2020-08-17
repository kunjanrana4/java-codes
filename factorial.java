
//Check if number is factorial
import java.util.*;

class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5,fact=1;
		while(n!=0){
		    fact = fact*n--;
		}
		System.out.println("Factorial is "+ fact);
	}
}
