import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
 
		int N = scr.nextInt();
		scr.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}