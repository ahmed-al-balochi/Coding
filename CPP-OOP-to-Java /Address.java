import java.util.Scanner;

public class Address {
    private String House;
    private String Street;
    private String Colony;
    private String City;

    public Address(){
        House = "";
        Street = "";
        Colony = "";
        City = "";
    }

    public void HouseSetter(String H){
        House = H;
    }
    public String HouseGetter(){
        return House;
    }

    public void StreetSetter(String S){
        Street = S;
    }
    public String StreetGetter(){
        return Street;
    }

    public void ColonySetter(String Co){
        Colony = Co;
    }
    public String ColonyGetter(){
        return Colony;
    }

    public void CitySetter(String C){
       City = C;
    }
    public String CityGetter(){
        return City;
    }

    public void SetLocation(String h, String s, String Co, String c){				// compostion address
	House = h;
	Street = s;
    Colony = Co;
	City = c;
	}
    public void GetLocation(){
        System.out.println("Address:\nHouse " + House + ", Street " + Street+ ", Colony "+ Colony + ", City " + City);
    }
    public void RemoveAddress(Address ad){
        House  = null;
        Street  = null;
        Colony  = null;
        City  = null;
    }
}
