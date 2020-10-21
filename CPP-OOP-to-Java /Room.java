import java.util.Scanner;

public class Room {
    private int room_num;
	private String room_info;
	private int room_floor_num;
	private Hostel h; //compostion
	private HostelManager hm; //compostion

    public Room(Hostel hObj,HostelManager hmObj){
       h = hObj;
       hm = hmObj;
    }

    public void SetRoom(int r) {
		room_num = r;
	}

	public void UpdateRoom(int r) {
		room_num = r;
	}

	public void CreateRoomInfo() {
		String rom_info;
		System.out.println( "Enter Room info " );
        Scanner in = new Scanner(System.in);
		rom_info = in.nextLine();
		room_info = rom_info;
	}

    public int GetRoom() {
		return room_num;
	}

	public void SetRoomFloor(int rn) {
		room_floor_num = rn;
	}

	public void UpdateRoomFloor(int rom_flor) {
		room_floor_num = rom_flor;
	}

	public void DisplayRoomInfo(){
		System.out.println( "Room floor is " + room_floor_num );
		System.out.println( "Room Info " + room_info );
	}
}
