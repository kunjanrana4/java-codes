//remove duplicates
import java.util.*;

class RemoveDuplicates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int array[] = {1,2,3,4,2,3,5,5,6,2,4,9,5,6,1,8};
		int temp[] = new int[array.length-1];
		int j=0;
	    Arrays.sort(array);
		for(int i=0;i<array.length-1;i++){
		    if(array[i]!=array[i+1])
		        temp[j++] = array[i];
		}
		temp[j++] = array[array.length-1];
		for(int i=0;i<j;i++){
		    array[i] = temp[i];
		}
		for(int i=0;i<j;i++){
		    System.out.print(array[i]+" ");
		}
	}
}
