import java.util.Scanner;

public class Comparison {

 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b;
		 String s1,s2;
		 Scanner s=new Scanner(System.in);
		System.out.println("Enter First string");
		s1=s.nextLine();
		
		System.out.println("Enter Second string");
		s2=s.nextLine();
		b=s1.equals(s2);
		System.out.println(b);
		

	}

}
