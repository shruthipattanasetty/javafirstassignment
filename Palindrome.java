import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a string");
	        String A=sc.next();
	         StringBuilder strBuilder = new StringBuilder();
	        strBuilder.append(A);
	        if (strBuilder.reverse().toString().equals(A)) {
	            System.out.println("Yes,entered string is a palindrome");
	        } else {
	            System.out.println("No,entered string is not a palindrome");
	        }
	}

}
