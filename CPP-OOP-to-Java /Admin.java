import java.util.Scanner;
import User.java;

public class Admin extends User{
    private int AdminID;

    public Admin(){
       AdminID ++;
    }
    public String AdminIDGetter(){
        return AdminID;
    }
    public void AdminIDGetter(String ID){
        AdminID = ID;
    }
}
