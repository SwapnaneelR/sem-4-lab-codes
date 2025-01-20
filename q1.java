import java.util.*;
class Room{
	int height,width,breadth;
	Room(int a, int b,int c){
		height = a;
		width = b;
		breadth = c;
	}
	void volume(){
		int vol = height * width* breadth;
		System.out.println("Volume = "+vol);
	}
}

class RoomDemo{
	public static void main(String args[]){
		Room r1 = new Room(1,2,3);
		r1.volume();
		Room r2 = new Room(3,4,5);
		r2.volume();
	}
}

