import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
 
		Scanner scr = new Scanner(System.in);
 
		int a = scr.nextInt();
 
		for (int i = 1; i <= a; i++) {
			int c = scr.nextInt();
			int d = scr.nextInt();
 
			System.out.println("Case #" + i + ": " + (c + d));
		}
 
		scr.close();
	}
}
