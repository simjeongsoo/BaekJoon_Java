import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) {
 
		Scanner scanner = new Scanner(System.in);
 
		int c = scanner.nextInt();
		int arr[] = new int[c];
 
		for (int i = 0; i < c; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr[i] = a + b;
		}
		scanner.close();
 
		for (int k : arr) {
			System.out.println(k);
		}
	}
 
}
