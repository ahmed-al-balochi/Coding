//Create an interface VehicleFunctionswith methods
//void switchOn();voiddrive();void switchOff();void turnOnLights();void turnOffLights()
//Create an abstract class Vehicle with attributes name, model, brand and number_of_wheels.
//Create an abstract method display()
//. Create two concrete classes Car & Bike that extends Vehicle and implements VehicleFunctions.

interface VehicleFunctions{
    public void switchOn();
    public void drive();
    public void switchOff();
    public void turnOnLights();
    public void turnOffLights();
}
abstract class Vehicle{
    String Name;
    String Brand;
    String Model;
    String NumberOfWheels;
    boolean VehicleState;
    boolean GearState;
    boolean LightsState;
    abstract void Display();
}
class Car extends Vehicle implements VehicleFunctions{
    Car(String name, String brand, String model, String number_of_wheels){
       this.Name = name;
       this.Brand = brand;
       this.Model = model;
       this.NumberOfWheels = number_of_wheels;
    }
    public void switchOn(){
        VehicleState = true; // means Vehicle ON
    }
    public void drive(){
        GearState = true; //means in Drive
    }
    public void switchOff(){
        VehicleState = false; // means Vehicle Off
        GearState = false; //means in not in Drive
    }
    public void turnOnLights(){
        LightsState = true; //means lights are ON
    }
    public void turnOffLights(){
        LightsState = false; //means lights are Off
    }
    void Display(){
        System.out.println("\nCar Name: "+Name+"\nCar Model: "+Model+"\nBrand : "+Brand+"\nNumber Of Wheels: "+NumberOfWheels);
        System.out.println("Vehicle State: "+VehicleState+"\nGear State: "+GearState+"\nLights State: "+LightsState);
    }
}
class Bike extends Vehicle implements VehicleFunctions{
    Bike(String name, String brand, String model, String number_of_wheels){
       this.Name = name;
       this.Brand = brand;
       this.Model = model;
       this.NumberOfWheels = number_of_wheels;
    }
    public void switchOn(){
        VehicleState = true; // means Vehicle ON
    }
    public void drive(){
        GearState = true; //means in Drive
    }
    public void switchOff(){
        VehicleState = false; // means Vehicle Off
        GearState = false; //means in not in Drive
    }
    public void turnOnLights(){
        LightsState = true; //means lights are ON
    }
    public void turnOffLights(){
        LightsState = false; //means lights are Off
    }
    void Display(){
        System.out.println("\nBike Name: "+Name+"\nBike Model: "+Model+"\nBrand : "+Brand+"\nNumber Of Wheels: "+NumberOfWheels);
        System.out.println("Vehicle State: "+VehicleState+"\nGear State: "+GearState+"\nLights State: "+LightsState);
    }
}

public class VehicleMain{
    public static void main(String []args){
        Car car = new Car("Phantom","Rolls Royce","2021","4");
        Bike bike = new Bike("70","Honda","2020","2");

        car.switchOn();
        car.drive();
        car.turnOnLights();
        car.Display();
        car.switchOff();
        car.turnOffLights();
        car.Display();

        bike.switchOn();
        bike.drive();
        bike.turnOnLights();
        bike.Display();
        bike.switchOff();
        bike.turnOffLights();
        bike.Display();
    }
}
