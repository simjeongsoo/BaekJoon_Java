import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int A = scr.nextInt();	
		int B = scr.nextInt();	
		int C = scr.nextInt(); 	
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
	}
}

