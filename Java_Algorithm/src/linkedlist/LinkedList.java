package linkedlist;

public class LinkedList {
	//���� ����Ʈ�� ��ü�� �Ǵ� �迭(��� ���� �ִ� 10���� �Ѵ�)
	public static StationList_[] list = new StationList_[10];

	public static int head;
	//�ʱ� ���¸� ����� �Լ� - �ν��Ͻ� ���� �ʿ�
	public static void initStationList() {
		for(int i = 0; i<  list.length; i++) {
			list[i] = new StationList_();
		}
		
		//�� �̸��� ���� ���� ����
		list[0].name = "�λ�";
		list[0].next = -1;
		list[1].name = "����";
		list[1].next = 3;
		list[2].name = "����";
		list[2].next = 4;
		list[3].name = "�뱸";
		list[3].next = 0;
		list[4].name = "�ƻ�";
		list[4].next = 1;
		
		//head �� 
				
		
		
		
	}
}
