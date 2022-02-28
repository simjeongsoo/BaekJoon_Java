import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
 
		Scanner scr = new Scanner(System.in);
 
		int T = scr.nextInt();
 
		for (int i = 1; i <= T; i++) {
			int A = scr.nextInt();
			int B = scr.nextInt();
 
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
 
		scr.close();
	}
}
