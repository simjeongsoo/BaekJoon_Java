import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scr = new Scanner(System.in);
 
		int up = scr.nextInt();	
		int down = scr.nextInt();	
		int length = scr.nextInt(); 	
 
		int day = (length - down) / (up - down);
        
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}
