import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int T = scr.nextInt();
		for(int i = 0; i < T; i++) {
	
			int R = scr.nextInt();
			String S = scr.next();
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
	}
}
