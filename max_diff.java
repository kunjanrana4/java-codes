import java.io.*; 
  
class MaximizeDifference
{ 
    static int maximumDifferenceSum(int arr[], int N) 
    {  
        int m[][] = new int [N][2]; 
  
        for (int i = 0; i < N; i++) 
            m[i][0] = m[i][1] = 0; 
      
        for (int i = 0; i< (N - 1); i++) 
        { 
            m[i + 1][0] = Math.max(m[i][0],m[i][1] + Math.abs(1 - arr[i])); 
            m[i + 1][1] = Math.max(m[i][0] + Math.abs(arr[i + 1] - 1),m[i][1] + Math.abs(arr[i + 1] - arr[i])); 
        } 
      
        return Math.max(m[N - 1][0], m[N - 1][1]); 
    } 
  
    public static void main (String[] args)  
    { 
        int arr[] = {1,2,4,6,5,3}; 
        System.out.println( maximumDifferenceSum(arr,arr.length)); 
                  
    } 
} 
