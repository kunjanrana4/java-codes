//Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i

import java.util.*;
import java.lang.*;
import java.io.*;

class Rearrange
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
              11, 10, 9, 5, 13,-1, 2, 14, 17, 4};
        int ele, size = arr.length;
        for(int i=0;i<size;){
            if(arr[i]>-1 && arr[i]!=i){
                ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            }
            else
                i++;
        }
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
	}
}
