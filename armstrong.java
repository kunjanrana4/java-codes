
class Armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=371, sum=0,digit = 0;
		int temp = n;
		while(n!=0){
		    digit = n%10;
		    sum = sum + digit*digit*digit;
		    n=n/10;
		}
		if(sum==temp){
		    System.out.println("Number is armstrong");
		}
		else    
		    System.out.println("Number is not armstrong");
	}
}
