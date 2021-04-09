import java.io.*;
import java.util.*;
public class Task1{
    public static void main (String []args) throws IOException{
        FileInputStream in = null;
        try{
            in = new FileInputStream("InTask1.txt");
            Scanner scan = new Scanner(in);
            int c;
            while((scan.hasNext())){
                int i=-1;
                i++;
                String str = scan.nextLine();
                String str2[] = str.split(";");
                System.out.println("Value of "+str2[i]);
            }
        }finally{
            if(in != null){
                in.close();
            }
        }
    }
}
