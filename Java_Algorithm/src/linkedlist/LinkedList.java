package linkedlist;

class StationList{
	public String name;
	public int next;
}

public class LinkedList {

	public static StationList[] list = new StationList[10];

	public static int head;
	
	public static void initStationList() {
		for(int i = 0; i<  list.length; i++) {
			list[i] = new StationList();
		}
		
		
	}
}
