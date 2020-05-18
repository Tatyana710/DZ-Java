/* Написать функцию, которая возвращает минимум из трёх чиселю */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(min( a,b,c));}


    static int min(int a, int b, int c) {
        if (a > b && b > c) return c;
        else if (c > a && a > b) return b;
        else if (c > a && b > a) return a;
        return min(a,b,c);

    }

       private static void min(int a, int b) {
           return;



      

