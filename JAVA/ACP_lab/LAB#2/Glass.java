// Class Glass
// attributs opacity thickness
// abstract method show
// extend Glass in class WindowGlass
// attributs of WindowGlass width highet
// override show method to display all attributes
// extend WindowGlass in Class in CarWindowGlass
// override the show method to show all attributes

public class Glass{
    private int opacity;
    private int thickness;
    Glass(){
        this.opacity = 0;
        this.thickness = 0;
    }
    abstract void Show();
// end of Glass
}
class WindowGlass extends Glass{
    private int width;
    private int highet;
}
    public static void main(String []args){
        //Glass glass = new Glass();
        //glass.Show();
