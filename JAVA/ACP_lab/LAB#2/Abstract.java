// Class Glass
// attributs opacity thickness
// abstract method show
// extend Glass in class WindowGlass
// attributs of WindowGlass width highet
// override show method to display all attributes
// extend WindowGlass in Class in CarWindowGlass
// override the show method to show all attributes

abstract class Glass{
     int opacity;
     int thickness;
    abstract void Show();
// end of Glass
}
class WindowGlass extends Glass{
     int width;
     int highet;
    WindowGlass(){
        this.width = 1;
        this.highet = 1;
        this.opacity = 1;
        this.thickness = 1;
    }
    void Show(){
        System.out.println("Opacity = "+ opacity+"\nThickness= "+thickness);
        System.out.println("Width = "+ width+"\nHighet = "+highet);
    }
}
class CarWindowGlass extends WindowGlass{
    CarWindowGlass(){
        this.width = 2;
        this.highet = 2;
        this.opacity = 2;
        this.thickness = 2;
    }
    void Show(){
        System.out.println("Opacity = "+ opacity+"\nThickness= "+thickness);
        System.out.println("Width = "+ width+"\nHighet = "+highet);
    }
}
class Abstract{
    public static void main(String []args){
        WindowGlass windowglass = new WindowGlass();
        CarWindowGlass carwindowglass = new CarWindowGlass();
        System.out.println("WindowGlass Show method:");
        windowglass.Show();
        System.out.println("Now CarWindowGlass Show method:");
        carwindowglass.Show();
    }
}
