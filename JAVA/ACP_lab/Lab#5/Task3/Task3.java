import java.io.*;
import java.util.*;
public class Task3{
    public static void main (String []args) throws IOException{
        Scanner scan= new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);
        String userName =" ", aLine=" ";
        int userGames=0, played =0,fine = 0;
    //process
    System.out.println("to Play Enter 1\nto Checkout Enter 2 ");
    int sw= scan.nextInt();
    switch(sw){
    case 1:
        FileWriter out = new FileWriter("OutTask3.txt");
        BufferedWriter bw = new BufferedWriter(out);
    System.out.println("Enter your Name: ");
    userName = scan2.nextLine();
    System.out.println("How many games are you going to play: ");
    userGames = scan.nextInt();
    aLine=userName+" "+userGames+"\n";
    bw.write(aLine);
    bw.close();
    out.close();
    break;
    case 2:
        FileReader in = new FileReader("OutTask3.txt");
        BufferedReader br = new BufferedReader(in);
            Scanner scan3 = new Scanner(in);
            String file = scan3.nextLine();
            int asci=0;
		for(int i = 0; i < file.length(); i++)
		{
			asci = file.codePointAt(i);
			if(asci >= 48 && asci <= 57 ) {
//figer out how to know if this is number
				userGames = asci;
    System.out.println(userGames );
			}
        }
    System.out.println("To check out Enter the number of games played: ");
    played = scan.nextInt();
    if(played>userGames){
    fine = played-userGames;
    System.out.println("You Have played more than you have paid for. Please pay your remaining games which are: "+fine);
    fine = scan.nextInt();
    System.out.println("Thank you, Have a nice day :) ");
    }
    else
    System.out.println("Have a nice day :) ");
    br.close();
    in.close();
    break;
    default:
    System.out.println("Something is wrong, please check your input");
    break;
    }

    }
}
