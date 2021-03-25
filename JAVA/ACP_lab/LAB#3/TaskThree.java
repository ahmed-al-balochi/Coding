//Create a program in which you have two Rides (Car, Boat)and two locations (Land, Water)
//.Ask from the user about the ride and the location.
//If user selects ride a car and location water, then throw an exception.
//Similarly if user selects ride a boat and location water, then also throw an exception.

import java.util.*;
class MyException extends Exception{
    String str;
    String str2 = "No Exceptions Occurred, Everything Ran Smoothly";  // This only works if the program runs with no exceptions
    MyException(String in){
        str = in;
    }
    public String toString(){
        if(str.equals("Car Water") || str.equals("car water"))
            str2 = "Exception!! Car can't run on Water this is not James Bond!!";
        if(str.equals("Boat Land") || str.equals("boat land"))
            str2 = "Exception!! boat can't run on land unless its a hover boat!!";
     return str2;
    }
}

public class TaskThree{
    String Car, Boat, Water, Land;

    String Ride(String ride){
        if(ride.equals("Car") || ride.equals("car"))
            this.Car = ride;
        if(ride.equals("Boat") || ride.equals("boat"))
            this.Boat = ride;
        return ride;
    }

    String Location(String location){
        if(location.equals("Land") || location.equals("land"))
            this.Land = location;
        if(location.equals("Water") || location.equals("water"))
            this.Water = location;
        return location;
    }
    public void DisplayCar(){
        System.out.println("Ride: "+Car+" Location: "+Land);
    }
    public void DisplayBoat(){
        System.out.println("Ride: "+Boat+" Location: "+Water);
    }

    public static void main(String []args){
        String input,test;
        TaskThree t = new TaskThree();
        TaskThree t2 = new TaskThree();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Ride(Can be either Car Or Boat): ");
        input = in.nextLine();
        test = t.Ride(input);
        t.Ride(input);
        System.out.println("Enter Location(Can be either Land Or Water): ");
        input = in.nextLine();
        test = test+" "+t.Ride(input);
        t.Location(input);
        //System.out.println(test);
        //t.DisplayCar();
        try{
        throw new MyException(test);
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
