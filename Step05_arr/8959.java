import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
 
		String arr[] = new String[scr.nextInt()];
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scr.next();
		}
		
		scr.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}
