
public class EqualsIgnoreCaseExample {

	public static void main(String[] args) {
		String s1 ="The walking dead";
		String s2 ="The walking dead";
		String s3 ="THE WALKIMG DEAD";
		String s4 = "The WEST WEEDS";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		// TODO Auto-generated method stub

	}

}