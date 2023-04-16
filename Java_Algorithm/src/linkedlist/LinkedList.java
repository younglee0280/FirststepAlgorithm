package linkedlist;

public class LinkedList {
	//연결 리스트의 실체가 되는 배열(요소 수는 최대 10으로 한다)
	public static StationList_[] list = new StationList_[10];

	public static int head;
	//초기 상태를 만드는 함수 - 인스턴스 생성 필요
	public static void initStationList() {
		for(int i = 0; i<  list.length; i++) {
			list[i] = new StationList_();
		}
		
		//역 이름과 연결 정보 설정
		list[0].name = "부산";
		list[0].next = -1;
		list[1].name = "대전";
		list[1].next = 3;
		list[2].name = "서울";
		list[2].next = 4;
		list[3].name = "대구";
		list[3].next = 0;
		list[4].name = "아산";
		list[4].next = 1;
		
		//head 값 
				
		
		
		
	}
}
