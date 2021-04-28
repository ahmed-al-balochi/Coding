import java.util.*;
import java.io.*;

class MyException extends Exception{
    int exp;
    String str2 = "No Exceptions Occurred, Everything Ran Smoothly";  // This only works if the program runs with no exceptions
    MyException(int in){
        this.exp = in;
    }
    public String toString(){
        if(exp ==100)
            str2 = "Exception!! Int = 100.";
        else
            str2 = "No Exceptions Occurred, Everything Ran Smoothly";  // This only works if the program runs with no exceptions
     return str2;
    }
}
public class Task1 {
	public static void main(String[] args) throws Exception {
		File file = new File("Midterm_Exam.txt");

		try (
			PrintWriter output = new PrintWriter(file);
		) {
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * (100-0+1)) + 0));
				output.print(" ");
			}
		}

		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
         try{
        int a = input.nextInt();
        System.out.print(a+" ");
        throw new MyException(a);
        }catch(MyException e){
        System.out.println(e);
        }
        }
		Collections.sort(list);
		System.out.print(list.toString());
		System.out.println();
	}
}
