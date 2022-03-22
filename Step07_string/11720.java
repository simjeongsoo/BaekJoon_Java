import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {		
		Scanner scr = new Scanner(System.in);
 
		int N = scr.nextInt();
		String a = scr.next();
		scr.close();
		
		int sum = 0;
        
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.print(sum);
	}
}
 
