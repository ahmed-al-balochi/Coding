import java.io.*;
import java.util.*;
public class Task2{
    public static void main (String []args) throws IOException{
		String allStr;
		int i, capletter,space, smlletter, digit, special;
		i = smlletter = space = capletter = digit = special = 0;
		int asci;
        FileReader in = new FileReader("InTask2.txt");
        BufferedReader br = new BufferedReader(in);
        FileWriter out = new FileWriter("OutTask2.txt");
        BufferedWriter bw = new BufferedWriter(out);

            Scanner scan = new Scanner(in);
            allStr = scan.nextLine();
            int c;

		for(i = 0; i < allStr.length(); i++)
		{
			asci = allStr.codePointAt(i);
			if(asci ==32 ) {
				space++;
			}
			else if(asci >= 48 && asci <= 57 ) {
				digit++;
			}
			else if(asci >= 65 && asci <= 90){
                 capletter++;
            }
             else if( asci >= 97 && asci <= 122)  {
				smlletter++;
             }
			else {
				special++;
			}
		}
		String Line="Text From File is: "+allStr;
        Line=Line +"\nNumber of Capital Letter Characters  =  " + capletter;
		Line=Line +"\nNumber of Small Letter Characters  =  " + smlletter;
		Line=Line +"\nNumber of Digit Characters     =  " + digit;
		Line=Line +"\nNumber of Special Characters   =  " + special;
		Line=Line +"\nNumber of Space Characters   =  " + space+ "\n";
        out.write(Line);
    br.close();
    bw.close();
    in.close();
    out.close();
    }
}
