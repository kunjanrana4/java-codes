
//print pattern
import java.util.*;

class Pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=5,i,j,k;
		for(i=)
		for(i=0;i<n;i++){
		    for(int space=n-i-1;space>0;space--){
		        System.out.print(" ");
		    }
		    for(j=0;j<i+1;j++){
		       System.out.print("**");
		    }
		    System.out.println();
		}
		 
		for(i=0;i<n;i++){
		    for(int space=0;space<i+1;space++)
		        System.out.print(" ");
		    for(j= n-i-1;j>0;j--){
		        System.out.print("**");
		    }
		    System.out.println();
		}   
	}
}
