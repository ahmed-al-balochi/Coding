//There are N number of bottlesand M number of glassesthat will be filled from these bottles.
//Each bottle can fill up 5 glasses.
//You are to write a program that will ask user to input N and M, and check if thebottles are enough to fill M glasses.
//If bottles are not enough throw an exception informing the user.
//HINT: Total number of glasses that can be made from bottles = 5*number of bottles


import java.util.*;
class MyException extends Exception{
    Boolean ex;
    MyException(boolean Even){
       this.ex = Even;
    }
    public String toString() {
        String str2;
        if(!ex)
            str2 = "Exception!! Cannot fill the Glasses";
        else
            str2 = "Can fill the Glasses";
        return str2;
    }
}

public class TaskFour{
    public static boolean CheckEven(int bottle, int Glass){
        boolean Even;
        int Total = 5*bottle;
        if(Total == Glass)
            Even = true;
        else
            Even = false;
        return Even;
    }
    public static void main(String[]args){
        int N_Bottle,M_Glass;
        boolean Even;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of Bottles(N): ");
        N_Bottle = in.nextInt();
        System.out.println("Enter Number Of Glasses(M): ");
        M_Glass = in.nextInt();
        try{
        Even = CheckEven(N_Bottle,M_Glass);
        throw new MyException(Even);
        }catch(MyException e){System.out.println(e);}
    }
}
