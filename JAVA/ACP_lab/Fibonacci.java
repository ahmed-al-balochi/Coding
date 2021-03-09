import java.io.*; 
import java.util.Scanner;
public class Fibonacci { 
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    public static void main(String args[]) {
Scanner getFib = new Scanner(System.in);
	int start,end;	
	System.out.print("Enter Where you want the Fibonacci Series to Start: ");
	start = getFib.nextInt();
	System.out.print("Enter Where you want the Fibonacci Series to End: ");
	end = getFib.nextInt();
	System.out.println("## Fibonacci Series ##");

	System.out.print("Fibonacci Series of "+end+" numbers: ");
	for(int i = 0; i < end; i++){
		if(i>start && fibonacciRecursion(i) != end)
			System.out.print(fibonacciRecursion(i) +" ");
		else
		continue;
		}
	}
}
