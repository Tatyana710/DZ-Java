/*
task_2.9
Напишите фрагмент кода, который принимает от пользователя число и если число чётное, то программа выводит
на экран число, котрое больше введённого с клавитатуры на 10, в противном случае выводит на экран число 
в 10 раз больше введённого
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 0; i < 100; i++) {
            if ((a % 2) == 0) {
                System.out.println(a + 10);
            } else {
                if ((a % 2) != 0) ;
                {
                    System.out.println(a * 10);
                }
            }
        }
    }
}

