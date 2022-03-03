import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int N = scr.nextInt();
		int X = scr.nextInt();
        
		StringBuilder sb = new StringBuilder();
 
		for(int i = 0 ; i < N ; i++) {
			
			int value = scr.nextInt();
			if(value < X) {
				sb.append(value+" ");
			}
		}
		System.out.println(sb);	
	}
}
