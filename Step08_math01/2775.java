import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		int[][] APT = new int[15][15];
 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
 
 
		for(int i = 1; i < 15; i ++) {	// 1~14
 
			for(int j = 2; j < 15; j++) {	// 2~14
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		 		
    //test
		int T = scr.nextInt();
		for(int i = 0; i < T; i++) {
			int k = scr.nextInt();
			int n = scr.nextInt();
			System.out.println(APT[k][n]);
		}
	}
 
}
 
