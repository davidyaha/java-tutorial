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

Have Fun! 
	