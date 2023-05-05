package linkedlist;

class StationList_{
	public String name;
	public int next;
}

public class LinkedList_detail {
	public static StationList[] list = new StationList[10];
	
	public static int head;
	
	public static void initStationList() {
		for (int i = 0; i < list.length; i++) {
			list[i] = new StationList();
		}
		
		list[0].name = "╪╜©О";
		list[0].next = -1;
		list[1].name = "©Ж╫лео";
		list[1].next = 3;
		list[2].name = ""
	}

	public static void main(String[] args) {

	}

}
