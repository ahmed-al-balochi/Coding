//Create  an  interface  of car  rentals
//offering  multiple  companies  that  rents  cars
//. it  can  be implemented by multiple companies and offer services to rent cars of customer’s choice.
import java.util.Scanner;
interface CarRental{
    public void Rent();
    public void RentBill();
}

class Honda implements CarRental{
    String Name;
    String Model;
    double RentPrice;
    public void Rent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Car's Name: ");
        Name = in.nextLine();
        System.out.println("Enter Car's Model: ");
        Model = in.nextLine();
        System.out.println("Enter Car's Rent Price: ");
        RentPrice = in.nextDouble();
    }
    public void RentBill(){
        System.out.println("\nRent Bill:\nCar Name: "+Name+"\nCar Model: "+Model+"\nRent Price: "+RentPrice+"\n");
    }
}
class Toyota implements CarRental{
    String Name;
    String Model;
    double RentPrice;
    public void Rent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Car's Name: ");
        Name = in.nextLine();
        System.out.println("Enter Car's Model: ");
        Model = in.nextLine();
        System.out.println("Enter Car's Rent Price: ");
        RentPrice = in.nextDouble();
    }
    public void RentBill(){
        System.out.println("\nRent Bill:\nCar Name: "+Name+"\nCar Model: "+Model+"\nRent Price: "+RentPrice+"\n");
    }
}
class Suzuki implements CarRental{
    String Name;
    String Model;
    double RentPrice;
    public void Rent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Car's Name: ");
        Name = in.nextLine();
        System.out.println("Enter Car's Model: ");
        Model = in.nextLine();
        System.out.println("Enter Car's Rent Price: ");
        RentPrice = in.nextDouble();
    }
    public void RentBill(){
        System.out.println("\nRent Bill:\nCar Name: "+Name+"\nCar Model: "+Model+"\nRent Price: "+RentPrice+"\n");
    }
}

public class Interface{
    public static void main(String []args){
        Honda honda = new Honda ();
        Toyota toyota = new Toyota ();
        Suzuki suzuki = new Suzuki ();
        honda.Rent();
        toyota.Rent();
        suzuki.Rent();

        honda.RentBill();
        toyota.RentBill();
        suzuki.RentBill();
    }
}
