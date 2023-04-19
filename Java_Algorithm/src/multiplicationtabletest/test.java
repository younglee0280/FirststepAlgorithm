package multiplicationtabletest;

public class test {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Geez");
		
		s.append(" world");
		System.out.println(s);
		s.insert(5, "!!! ");
		System.out.println(s);
		s.delete(0, 7);
		System.out.println(s);
		
		String data = s.toString();
	}

}
