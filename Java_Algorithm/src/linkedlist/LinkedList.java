package linkedlist;

public class LinkedList {
	//���� ����Ʈ�� ��ü�� �Ǵ� �迭(��� ���� �ִ� 10���� �Ѵ�)
	public static StationList[] list = new StationList[10];

	public static int head;
	//�ʱ� ���¸� ����� �Լ� - �ν��Ͻ� ���� �ʿ�
	public static void initStationList() {
		for(int i = 0; i<  list.length; i++) {
			list[i] = new StationList();
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
		
		//head �� ����
		head = 2;
	}
		//���� ����Ʈ�� ��Ҹ� ǥ���ϴ� �޼���
		public static void printStationList() {
			int idx = head;
			while (idx != -1) {
				System.out.printf("[" + list[idx].name + "] -> ");
				idx = list[idx].next;
			}
			
			System.out.printf("\n");
		}
		
		////���� ����Ʈ�� ��Ҹ� �����ϴ� �޼���
		public static void insertStationList(int insIdx, String insName, int prevIdx) {
			list[insIdx].name = insName;
			list[insIdx].next = list[prevIdx].next;
			list[prevIdx].next = insIdx;
		}
		
		//���α׷� ������ �������� main �޼���
		public static void main(String[] args) {
			//�ʱ� ������ ���� ����Ʈ�� �ۼ��� ǥ��
			initStationList();
			printStationList();
	
		////���� ����Ʈ�� ��Ҹ� �����Ͽ� ǥ��
			insertStationList(5, "����", 2);
			printStationList();
		}
}
