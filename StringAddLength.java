import java.util.Scanner;

public class StringAddLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int C = A.length() + B.length();
		System.out.println(C);
		if (A.compareTo(B)>0) {
			System.out.println("Yes");
		}else
			System.out.println("No");
//		String D = (A.substring(0, 1).toUpperCase() + A.substring(1)); 
//		String E = (B.substring(0, 1).toUpperCase() + B.substring(1));
//		String F = D.concat(E);
		String F = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(F);

	}

}

//https://www.hackerrank.com/challenges/java-strings-introduction/problem
