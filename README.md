java-tutorial
=============

This project is designed to become an ongoing tutorial for java language and frameworks.
The tutorial is targeted for Java SE 1.7. 

* The tutorial will focus on:
	* Basic concepts in java
	* Networking
	* Database Access
	* Multi threaded development
	* Testing
	* Debuging
	
* Instructions
	* Part I
		1. Create a new class named "ChatServer". ChatServer should have "RoomList" member of type ArrayList.
		2. Write createRoom method that will add a new ArrayList to RoomList.
		3. Write enterRoom method that will receive name and room number. The method will add a name provided
			into the room that was indicated. The method should check if the room exists before adding and if the
			indicated room does not exist, the method should throw an Exception. The method should check if the
			name exists in the room before adding, if so, throw an Exception.
		4. Write leaveRoom method that receives a name and a room. The method removes the name from the indicated
			room.
		5. Write a main function that will create a new ChatServer, prints a menu to the console, reads the user
			action and performs it.
			
	* Part II
		1. Create a new class named "Room" in a the same src directory. Room Should have name and a participants list.
			Room should have a constructor that will take in the name of the room and store it in it's member.
			Room should have getName method that will let other classes get it's name.
		2. Change the ChatServer class so it will have a room list member of type HashMap. The key should be name of
			the room and the value will be a Room class.
		3. Change the other methods of ChatServer to work with Room class.
		4. Change the return value of createRoom so it will return the Room object. The method should take the name of
			the room as parameter and should also throw an Exception if the room already exists.
		5. Change the return value of enterRoom method so it will return the Room that was entered.
		6. Change the leaveRoom method so it will return true or false if the room was actually leaved.
		7. Change the main function so it will give the user a menu after every action. (consider making printMenu function)
			Let the user know what happened after every action.

Have Fun! 
	