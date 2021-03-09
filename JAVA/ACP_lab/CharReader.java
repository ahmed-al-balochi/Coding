import java.util.Scanner;

public class CharReader{
private static Scanner sc;
	public static void main(String[] args) {
		String allStr;
		int i, capletter, smlletter, digit, special;
		i = smlletter = capletter = digit = special = 0;
		int asci;

		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Letters Digits Special Strings with no Space: ");
		allStr = sc.nextLine();

		for(i = 0; i < allStr.length(); i++)
		{
			asci = allStr.codePointAt(i);
			if(asci >= 48 && asci <= 57 ) {
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
		System.out.println("\nNumber of Capital Letter Characters  =  " + capletter);
		System.out.println("Number of Small Letter Characters  =  " + smlletter);
		System.out.println("Number of Digit Characters     =  " + digit);
		System.out.println("Number of Special Characters   =  " + special);
	}
}
