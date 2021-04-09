import java.io.*;

public class IO2{
    public static void main(String []args) throws IOException{
        //open
        FileReader in = new FileReader("infile.txt");
        BufferedReader br = new BufferedReader(in);
        FileWriter out = new FileWriter("outfile.txt");
        BufferedWriter bw = new BufferedWriter(out);
    //process
    String aLine=null;
    while((aLine = br.readLine()) !=null){
        bw.write(aLine);
        //close
    }
    br.close();
    bw.close();
    in.close();
    out.close();
    }
}
