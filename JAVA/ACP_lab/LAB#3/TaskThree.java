//Create a program in which you have two Rides (Car, Boat)and two locations (Land, Water)
//.Ask from the user about the ride and the location.
//If user selects ride a car and location water, then throw an exception.
//Similarly if user selects ride a boat and location water, then also throw an exception.

class MyException{
    String str;
    MyException(String in){
        str = in;
    }
    public String toString(){
        if(str == "Car Water" || str == "car water")
            str = "Car can't run on Water this is not James Bond!!";
        if(str == "Boat Land" || str == "boat land")
            str = "boat can't run on land unless its a hover boat!!";
     return str;
    }
}

public class TaskThree{
    String Car, Boat, Water, Land;

    String Ride(String ride){
        if(ride == "Car" || ride =="car")
            this.Car = ride;
        if(ride == "Boat" || ride =="boat")
            this.Boat = ride;
        return ride;
    }

    String Location(String location){
        if(location == "Land" || location =="land")
            this.Land = location;
        if(location == "Water" || location =="water")
            this.Water = location;
        return location;
    }
    public void Display(){
        System.out.println("Ride: "+Car+" Location: "+Land);
    }
    public static void main(String []args){
        TaskThree t = new TaskThree();
        TaskThree t2 = new TaskThree();
        t.Ride("Car");
        t.Location("Land");
        t.Display();

        t.Location("Water");


        t.Ride("Boat");
        t.Location("Water");
        t.Display();
        t.Location("Land");
    }
}
