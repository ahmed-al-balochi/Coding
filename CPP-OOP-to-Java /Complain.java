import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Complain{

    private Room r;				//compostion
	private Service s;			//compostion
	private HostelManager hm;		//aggreagation
	private Student st;			//aggreagation

	private String complain;
	private String complaint_reply;
	private String enquiry;
	private String enquiry_reply;

	public Complain(Room rObj, Service sObj ,HostelManager hmObj, Student stObj){
		s = sObj;
		r = rObj;
		st = stObj;
		hm = hmObj;
}
	public void write_complain() {

    Scanner in = new Scanner(System.in);
	System.out.println( "To make a complain enter 1" );
	System.out.println( "To Update a complain enter 2" );
	System.out.println( "To remove a complain enter 3" );

	int sw;
	sw = in.nextInt();
	in.nextLine();

		switch (sw)
		{
		case 1:
		{
			System.out.println( "You want to complain about this service "+ s.get_service());
			System.out.println( "Which is in this room "+ r.get_room());
			System.out.println( "Your name is "+ st.NameGetter());
			System.out.println( "\n\tEnter your complain here:" );
			complain = in.nextLine();
			break;
		}

		case 2:
		{
			System.out.println( "You want to Update your complain about this service "+ s.get_service());
			System.out.println( "Which is in this room "+ r.get_room());
			System.out.println( "Your name and email is "+ st.NameGetter());
			System.out.println( "\n\tEnter your Updated complain here:" );
			complain = in.nextLine();
			break;
		}

		case 3:
		{
			complain = null;
			System.out.println( "complain has been deleted " );
			break;

		}

		default:
			System.out.println( "Wrong input try again" );
			break;
		}
}

	public String show_complain() {
		System.out.println( "The complain is " + complain );
		return	complain;
	}

	public void create_complaint_reply() {
        Scanner in = new Scanner(System.in);
		System.out.println( "To make a complain reply enter 1" );
		System.out.println( "To Update a complain reply enter 2" );

		int sw;
		sw = in.nextInt();


			switch (sw)
			{
			case 1:
			{
				System.out.println( "You want to reply to this complain " + complain );
				System.out.println( "Which is in this room "+ r.get_room());
				System.out.println( "Your name is "+ hm.NameGetter());
				System.out.println( "\n\tEnter your reply here:" );
				complaint_reply = in.nextLine();
				break;
			}

			case 2:
			{
				System.out.println( "You want to Update the reply to this complain " + complain );
				System.out.println( "Which is in this room "+ r.get_room());
				System.out.println( "Your name is "+ hm.NameGetter());
				System.out.println( "\n\tEnter your reply here:" );
				complaint_reply = in.nextLine();
				break;

			}

			default:
				{
				System.out.println( "Wrong input try again" );
				break;
			}
		}
	}


	public String show_complain_reply() {
		System.out.println( "The complain reply is " + complaint_reply);
		return	complaint_reply;
	}

	public void create_enquiry() {
        Scanner in = new Scanner(System.in);
		System.out.println( "To make a complain enter 1" );
		System.out.println( "To Update a complain enter 2" );
		System.out.println( "To remove a complain enter 3" );

		int sw;
		sw = in.nextInt();


			switch (sw)
			{
			case 1:
			{
				System.out.println( "You have an inquiry about this service "+ s.get_service());
				System.out.println( "Which is in this room "+ r.get_room());
				System.out.println( "Your name is "+ st.NameGetter());
				System.out.println( "\n\tEnter your inquiry here:" );
				enquiry = in.nextLine();
				break;

			}

			case 2:
			{
				System.out.println( "You want to Update your inquiry about this service "+ s.get_service());
				System.out.println( "Which is in this room "+ r.get_room());
				System.out.println( "Your name and email is "+ st.NameGetter());
				System.out.println( "\n\tEnter your Updated inquiry here:" );
				enquiry = in.nextLine();
				break;

			}

			case 3:
			{
				enquiry = null;
				System.out.println( "inquiry has been deleted" );
				break;

			}

			default:
				System.out.println( "Wrong input try again" );
				break;
			}
		}

	public String show_enquiry() {
		System.out.println( "The inquiry is " + enquiry );
		return enquiry;
	}

	public void create_enquiry_reply() {
        Scanner in = new Scanner(System.in);
		System.out.println( "To make a complain reply enter 1" );
		System.out.println( "To Update a complain reply enter 2" );

		int sw;
		sw = in.nextInt();
		in.nextLine();


			switch (sw)
			{
			case 1:
			{
				System.out.println( "You want to reply to this inquiry " + enquiry );;
				System.out.println( "Which is in this room "+ r.get_room());
				System.out.println( "Your name is "+ hm.NameGetter());
				System.out.println( "\n\tEnter your reply here:" );
				enquiry_reply = in.nextLine();
				break;

			}

			case 2:
			{
				System.out.println( "You want to Update the reply to this inquiry " + enquiry );;
				System.out.println( "Which is in this room "+ r.get_room());
				System.out.println( "Your name is "+ hm.NameGetter());
				System.out.println( "\n\tEnter your reply here:" );
				enquiry_reply = in.nextLine();
				break;

			}

			default:
				System.out.println( "Wrong input try again" );
				break;
			}
		}

	public String show_enquiry_reply() {
		System.out.println( "The enquiry reply is " + enquiry_reply );
		return enquiry_reply;
	}
}
