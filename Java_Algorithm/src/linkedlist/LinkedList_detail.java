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
		
		list[0].name = "서울";
		list[0].next = -1;
		list[1].name = "워싱턴 D.C";
		list[1].next = 3;
		list[2].name = "아테네";
		list[2].next = 4;
		list[3].name = "파리";
		list[3].next = 0;
		list[4].name = "로마";
		list[4].next = 1;
		
		head = 2;
	}

	public static void printStationList() {
		int idx = head;
		while(idx != -1) {
			System.out.printf("["+ list[idx].name + "] ");
			idx = list[idx].next;
		}
		System.out.printf("\n");
	}
	
	public static void insertStationList(int insIdx, String insName, int prevIdx) {
		list[insIdx].name = insName;
		list[insIdx].next = list[prevIdx].next;
		list[prevIdx].next = insIdx;
	}
	
	public static void deleteStationList(int delIdx, int prevIdx) {
		list[prevIdx].next = list[delIdx].next;
	}
	
	public static void main(String[] args) {
		initStationList();
		printStationList();
		
		insertStationList(5, "캔버라", 2);
		printStationList();
		
		deleteStationList(5, 2);
		printStationList();
	}
}
