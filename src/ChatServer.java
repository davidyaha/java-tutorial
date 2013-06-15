import java.util.ArrayList;
import java.util.Scanner;

public class ChatServer {
	// your code:
	// String RoomList[];

	// Solution
	// notice i changed the name of the member name to _camelCase. this is a known standard.
	private ArrayList<ArrayList<String>> _roomList = new ArrayList<>(); // creating a new instance of class 
	// Notice ArrayList Class has a special feature - <ArrayList<String>> - it is called generics
	// (read about it!). basically what it does is make your
	// ArrayList have only cells of the type
	// inside the greater than, less than signs - <>

	/**
	 * Write createRoom method that will add a new ArrayList to RoomList.
	 */
	public void creatRoom() {
		// your code:
		// this.RoomList[0]="Empty";
		// this.RoomList[1]="Empty";
		// this.RoomList[2]="Empty";

		// Solution
		this._roomList.add(new ArrayList<String>()); // calling add method on ArrayList class.
		// Notice that a new instance of class ArrayList is created and given
		// to the add method. the instance is restricted to ArrayList with String only. 
	}
	
	public void enterRoom(int Num, String Name) throws Exception{
//		your code:		
//		if (this.RoomList[Num]==Name) do
//		return System.out.print("This room already got your name");//dunno why's an error her\\
//		else
//			this.RoomList[Num]=Name;
		
		// Solution
		ArrayList<String> room = this._roomList.get(Num); 	// trying to get the room.
															// if there's an error an exception will be
															// thrown by the get method.
		
		if (!room.contains(Name)) 
			room.add(Name);
		else
			throw(new Exception("This room already got your name"));
	} // you had a missing bracket..
	
	public void leaveRoom (int Num, String Name){ // you forgot the void..
		// your code:
		// this.RoomList[Num]="Empty";
		//would done an if or a while to search to room's name on the list on my array to see the index i shouldve deleted
		
		// Solution
		ArrayList<String> room = this._roomList.get(Num);
		if (room != null)
			room.remove(Name);
	}
	//Wouldve added another if statment to check wether the room exists but i dont know what will i get in 
	// return for going to this.RoomList[Num]= ??? if the num is beyond the list(eg :Num=5)

	public static void main(String[] args) {
//		your code:
//		ChatServer S;
//		System.out.println(S.RoomList[0]);
		
		// Solution
		ChatServer server = new ChatServer(); // creating a new ChatServer object
		
		System.out.println("Hello, what is your name?");
		Scanner scanner = new Scanner(System.in); // creating a scanner object that will help me read user input
		String username = scanner.nextLine(); // this line tells the scanner object to read a line and than store
		// data on username variable.
		
		System.out.println("Choose an option: "); // Printing a menu to the user
		System.out.println("1. Create a room.");
		System.out.println("2. Join a room.");
		System.out.println("3. leave a room");
		System.out.println("Any other number will quit the program.");
		
		int action = scanner.nextInt(); // tells scanner object to read an integer.
		int roomNum; // declaring a variable that will be used later for calling server object functions.
		
		boolean exit = false;
		while (!exit) {
			switch (action) {
			case 1:
				server.creatRoom();
				break; 	// prevents the switch from falling through to next case. if the concept is'nt familiar with
						// the concept you should read about switch conditional statement in java.
			case 2:
				System.out.println("\nWhat is the room number?");
				roomNum = scanner.nextInt(); // tells scanner object to read an integer.
				
				try { // this is part of Exception handling in java.
					// every Exception thrown inside this scope will be caught..
					server.enterRoom(roomNum, username);
				} catch (Exception e) /* This is what will be caught*/ {
					// This is what will happen if an Exception was caught. 
					System.out.println(e.getMessage()); // in this case, i want the user to know about the error.
				}
				
				break;
			case 3:
				System.out.println("\nWhat is the room number?");
				roomNum = scanner.nextInt();
				
				server.leaveRoom(roomNum, username);
				break;
			default:
				return;
			}
			
			System.out.println("\nWhat next?");
			action = scanner.nextInt();
		}
	}

}
