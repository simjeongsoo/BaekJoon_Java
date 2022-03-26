import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
 
		String S = scr.nextLine();
		scr.close();
 
		StringTokenizer st = new StringTokenizer(S," ");
		
		System.out.println(st.countTokens());	
		
	}
 
}
