import java.util.Scanner;
public class Stdin2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Double d = scan.nextDouble();
		int i = scan.nextInt();
		scan.close();
		System.out.println("String: Welcome " +str);
		System.out.println("Double: " +d);
		System.out.println("Integer: " +i);
		
	}

}
