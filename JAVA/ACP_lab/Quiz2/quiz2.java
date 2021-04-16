 import java.util.*;
class MyException extends Exception{
    String str;
    String str2 = "No Exceptions Occurred, Everything Ran Smoothly";  // This only works if the program runs with no exceptions
    MyException(String in){
        str = in;
    }
    public String toString(String ins){
    int in = Integer.parseInt(ins);
    if(in<100){
        System.out.println("Your Pages is ok");
    }
    if(in>100){
        System.out.println("Your Pages is Over size");
    }
    if(in<60){
        System.out.println("Your Play Time is ok");
    }
    if(in>60){
        System.out.println("Your Play Time is Over size");
    }

     return str;
    }
}
class Company{
        String name, address;
}
class Publication extends Company{
        String title;
        double price;
        void show(){}
}
class CD extends Publication{
    int PlayTime;
    CD(int pt){
        this.PlayTime = pt;
    }
    public int getPlayTime(){
        return PlayTime;
    }
}
class Book extends Publication{
    int Pages;
    Book(int pg){
        this.Pages = pg;
    }
    public int getPages(){
        return Pages;
    }
}
public class quiz2 {
    public static void main(String[]args){
        CD cd = new CD(50);
        Book book = new Book(78);
        String test1 ="";
        int a = getPages();
        test1 = String.valueOf(a);
        int b = getPlayTime();
        String test2 = String.valueOf(b);
        try{
        throw new MyException(test1);
        }catch(MyException e){
            System.out.println(e);
        }
        try{
        throw new MyException(test2);
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
