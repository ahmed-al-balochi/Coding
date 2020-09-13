import java.util.Scanner;

public class User{

    private String Password;
    private String Email;
    private String Name;
    // Addess d2; composition

    public User(){
    Password = " ";
    Email = " ";
    Name = " ";
    }

    public String NameGetter(){
        return Name;
    }
    public void NameSetter(String N){
        Name = N;
    }
    public String EmailGetter(){
        return Email;
    }
    public void EmailSetter(String E){
        Email = E;
    }
    public String PassGetter(){
        return Password;
    }
    public void PassSetter(String P){
        Password = P;
    }
    
    public void Login(){
        String UserName;
        String UserPass;
        String UserEmail;
        int LoginAttempt = 0;
        Scanner UN = new Scanner(System.in);
        Scanner UP = new Scanner(System.in);
        Scanner UE = new Scanner(System.in);
        while(LoginAttempt !=5){
            System.out.print("Please Enter the UserName: ");
            UserName = UN.nextLine();
            System.out.print("Please Enter the UserPassword: ");
            UserPass = UP.nextLine();
            System.out.print("Please Enter the UserEmail: ");
            UserEmail = UE.nextLine();
            // System.out.println("Name: "+UserName);
            if (UserName.equals(Name) && UserPass.equals(Password) && UserEmail.equals(Email))
        {
			System.out.println("Welcome "+UserName);
            break;
        }
        else
        {
            System.out.println("Invalid login attempt. Please try again.");
            LoginAttempt++;
        }

     }
}

  public void RegisterAccount() {	//takes input from user
        String n,p,e;

    Scanner nm = new Scanner(System.in);
    Scanner ps = new Scanner(System.in);
    Scanner em = new Scanner(System.in);

	System.out.print("Hello please enter your Name: ");
    n = nm.nextLine();
	Name = n;

	System.out.print("Hello please enter your Passward: ");
	p = ps.nextLine();
	Password= p;

	System.out.print("Hello please enter your Email: ");
	e = em.nextLine();
	Email = e;

	}
   public void UpdateLoginInfo() {
        int s;
		Scanner sin = new Scanner(System.in);
        Scanner nin = new Scanner(System.in);
        Scanner pin = new Scanner(System.in);
        Scanner ein = new Scanner(System.in);

		System.out.println( "to update Name enter 1 " );
		System.out.println( "to update Passward enter 2" );
		System.out.println( "to update email enter 3" );
		System.out.println( "enter your input" );
        s = sin.nextInt();
		switch (s)
		{
		case 1:
			{
			System.out.println( "Enter New Name " );
			String n;
			n = nin.nextLine();
			Name = n;
			break;
			}

		case 2:
		{
			System.out.println( "Enter New Passward " );
			String p;
			p = pin.nextLine();
            Password = p;
			break;
		}

		case 3:
		{
			System.out.println( "Enter New Email " );
			String e;
			e = ein.nextLine();
			Email = e;
			break;
		}
		default:
			System.out.println( "wrong input please try again " );
			break;
		}
	}
    public void RemoveAccount(User us){

		Name = null;
        Password = null;
        Email = null;
	}	// deletes the data

    public static void main(String[] args) {
        User a1=new User();
        User a2=new User();
        a1.RegisterAccount();
        a1.Login();
        a1.UpdateLoginInfo();
        a2 = a1;
        System.out.println("Name: "+ a1.NameGetter() +" Password" + a1.PassGetter()+ "Email" + a1.EmailGetter());
        a1.RemoveAccount(a1);
        System.out.println("Name: "+ a1.NameGetter() +" Password" + a1.PassGetter()+ "Email" + a1.EmailGetter());
    }
}
