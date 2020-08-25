/* ArrayGame */

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayGame
{
    static int maxPosition(int[] array){
        int pos = 0;
        for(int i=1;i<array.length;i++){
            if(array[i] > array[pos])
                pos = i;
        }
        return pos;
    }
    
    static boolean checkEquals(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i] != array[i+1])
                return false;
        }
        return true;
    }
    
    public static int solution(int[] array){
        int i,max,cnt=0;
        
        while(!checkEquals(array)){
            max = maxPosition(array);
            for(i=0;i<array.length;i++){
                if(i == max)
                    continue;
                array[i] += 1;
            }
            cnt++;
        }
        return cnt+1;
    }
	public static void main (String[] args)
	{
		int[] array = {1,2,3,4,6,5,9,4};
		System.out.println(solution(array));
	}
}
