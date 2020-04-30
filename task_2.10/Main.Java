/*task_2.10
назовём "весом числа" сумму его цифр. Напишите код, 
который принимает от пользователя число и выводит на экран его "вес".
*/
mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int a=number%10;
        int b=(number-a)/10;
         { System.out.println(a+b);

        }

    }

}

