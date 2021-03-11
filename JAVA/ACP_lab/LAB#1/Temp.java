import java.util.Scanner;

public class Temp {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int sw = 1,c=0,f=0;

        System.out.println(" ## Temprature Converter ## \n");
        while(sw != 0){
        System.out.println(" To convert from Celsius to Fahrenheit Enter 1: ");
        System.out.println(" To convert from Fahrenheit to Celsius Enter 2: ");
        System.out.println(" To Exit Enter 0: ");
        sw = in.nextInt();
        switch(sw){
            case 1:
            System.out.print("Enter Celsius Value: ");
            c = in.nextInt();
            f = c*9/5 + 32;
            System.out.println("\nAfter converting C to F\n F = " + f+"\n");
            break;

        case 2:
            System.out.print("Enter Fahrenheit Value: ");
            f = in.nextInt();
            c = (f - 32)*5/9;
            System.out.println("\nAfter converting F to C\n C = " + c+"\n");
            break;

        case 0:
            System.out.println("Good Bye!!");
            break;

            default:
                System.out.println("Wrong input!! Try again");
                break;
             }
        }
    }
}
