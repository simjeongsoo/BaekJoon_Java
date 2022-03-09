import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int[] arr = { scr.nextInt(), scr.nextInt(), scr.nextInt(),
				scr.nextInt(), scr.nextInt(), scr.nextInt(),
				scr.nextInt(), scr.nextInt(), scr.nextInt() };
		scr.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
		
	}
}
