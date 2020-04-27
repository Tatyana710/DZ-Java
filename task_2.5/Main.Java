import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();
        double procent = scan.nextDouble();
        for (int i = 0; i < 5; i++) {
            sum = sum + sum * procent / 100;
            System.out.println(sum);


        }
    }
}
