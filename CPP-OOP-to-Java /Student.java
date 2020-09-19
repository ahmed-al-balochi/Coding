import java.util.Scanner;

public class Student extends User{
    private String UniName;

    public Student(){
        UniName  = "";
    }
    public void UniNameSetter(String U){
        UniName  = U;
    }
    public String UniNameGetter(){
        return UniName;
    }
}
