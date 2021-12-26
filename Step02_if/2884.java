import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int time = 0;

        if (M - 45 < 0){
            H -= 1;
            time = 60-(Math.abs(M- 45));

            System.out.println(H+" "+time);
        }
    }
}

