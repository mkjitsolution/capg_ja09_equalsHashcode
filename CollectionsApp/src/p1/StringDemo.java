package p1;

public class StringDemo {
	public static void main(String[] args) {
		
		
		String emp = "ramesh@101#pune$8000%testing";
		
		String arr[] = emp.split("\\@|#|\\$|%");
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
