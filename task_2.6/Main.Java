/*task_2.6
Запросить у пользователя ввод числа и сохранить это число в переменную а. Если переменная а равна 10, то выведите "Верно",
иначе выведите "неверно".
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        if (a==10) System.out.println("True");
        else if (a<10) System.out.println("False");
        else if (a>10) System.out.println("False");

    }
}
