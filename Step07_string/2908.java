import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scr = new Scanner(System.in);
        
		int A = scr.nextInt();
		int B = scr.nextInt();
        
        scr.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
	
	}
}
