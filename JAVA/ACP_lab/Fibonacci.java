import java.util.*;

class Fibonacci
{
	public static void main(String args[])
	{
	        int i,c=0,start,end;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to start the Fibonacci series: ");
    	start=sc.nextInt();
		System.out.print("\nEnter the end number to Fibonacci series: ");
    	end=sc.nextInt();
  		int a=0;
   		int b=1;

		System.out.println("Fibonacci series upto "+end+" is :-");
   		while(c<=end)
			{
				if(c>=start){
       			System.out.print(c+" ");
				}
       			a=b;
       			b=c;
       			c=a+b;
   		}
	}
}
