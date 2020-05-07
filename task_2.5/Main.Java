/* Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить 
размер вклада поочерёдно на ближайшие 5 лет.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();
        System.out.println("Сумма вклада="+sum);
        double procent = scan.nextDouble();
        System.out.println("Процент=" +procent+" %");
        for (int i = 0; i < 5; i++) {
            sum = sum + sum * procent / 100;
            System.out.println(i+" год "+sum+" рублей");


        }
    }
}
