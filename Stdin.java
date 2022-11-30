import java.util.Scanner;


public class Stdin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.println("First Integer is " +a);
		System.out.println("Second Integer is " +b);
		System.out.println("Third Integer is " +c);					
	}

}
