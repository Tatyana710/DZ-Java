/* Вывести с клавиатуры год, количество дней в году. Результат вывести на экран в следующем виде: количество дней в году х.
Где х - 366 дней для високосного года
    х - 365 дней для обычного года.
    */
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();

        if (x % 100 == 0 && x % 400 == 0)
            System.out.println("количество дней в году: 366");

        else if (x % 4 == 0 && x % 100 > 0)
            System.out.println("количество дней в году: 366");

        else if (x % 100 == 0)
            System.out.println("количество дней в году: 365");

        else
            System.out.println("количество дней в году: 365");


    }
}
