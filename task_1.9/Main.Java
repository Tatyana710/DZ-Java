import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        int sum= a+b;
         if (a>b) System.out.println("Переменная a больше переменной b");
         else if (a<b) System.out.println("Переменная b больше переменной a");
         else System.out.println("Переменные равны");
         System.out.println(sum);
    }
}
