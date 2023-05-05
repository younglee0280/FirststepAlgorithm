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
		
		list[0].name = "����";
		list[0].next = -1;
		list[1].name = "������";
		list[1].next = 3;
		list[2].name = "���׳�";
		list[2].next = 4;
		list[3].name = "�ĸ�";
		list[3].next = 0;
		list[4].name = "�θ�";
		list[4].next = 1;
		
		head = 2;
	}

	public static void main(String[] args) {
		int idx = head;
		while(idx != -1) {
			System.out.printf("["+ list[idx].name + "] -> ");
			idx = list[idx].next;
		}
	}

}
