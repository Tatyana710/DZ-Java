/* Запросить у пользователя 2 числа (сохранить их в разные переменные).
Вывести на экран максимальное из двух чисел,если два числа равны, вывести их сумму*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        if (a>b) System.out.println("Переменная a больше переменной b: "+a);
        else if (a<b) System.out.println("Переменная b больше переменной a: "+b);
        else System.out.println("Переменные равны"+(a+b));

    }
}
