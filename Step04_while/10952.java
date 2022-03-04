import java.util.Scanner;
 
public class Main {
	public static void main(String args[]){
		
		Scanner scr = new Scanner(System.in);
				
		while(true){
		
			int A = scr.nextInt();
			int B = scr.nextInt();
		
			if(A == 0 && B == 0){
				scr.close();
				break;
			}
			System.out.println(A + B);
		}
	}
}
