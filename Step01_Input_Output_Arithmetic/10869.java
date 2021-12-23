import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int add = A+B;
        int sub = A-B;
        int mul = A*B;
        int div = A/B;
        int remain = A%B;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(remain);

    }
}
