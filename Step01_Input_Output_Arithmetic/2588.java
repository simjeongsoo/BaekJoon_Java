import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int one = B % 10;
        System.out.println(A*one);

        int ten = (B % 100)/10;
        System.out.println(A*ten);

        int hun = B / 100;
        System.out.println(A*hun);

        System.out.println(A*B);
        
    }
}

