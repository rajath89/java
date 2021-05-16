package java_generic_;
//Aggregation example;

/*
When two classes are related to each other by aggregation, reference of one class becomes a member of the other class and we can access the members of the aggregated class
 */

class Room {
	private int roomNo;

	public Room(int n) {
		System.out.println("Room created");
		this.setRoomNo(n);
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
}

public class Building_Aggregation_eg {
	public Room room;

	public Building_Aggregation_eg() {
		this.room = new Room(20);
		System.out.println(room.getRoomNo());
	}

	public Building_Aggregation_eg(Room room) {
		System.out.println("Building created");
		this.room = room;
	}

	public static void main(String args[]) {
		Building_Aggregation_eg b = new Building_Aggregation_eg();
	}
}
