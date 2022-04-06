import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
 
		int T = scr.nextInt();
 
		for(int i = 0; i < T; i++) {
			
			int H = scr.nextInt();
			int W = scr.nextInt(); 
			int N = scr.nextInt();
			
			if(N % H == 0) {
				System.out.println((H * 100) + (N / H));
 
			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
	}
}
