/* Написать функцию, которая возвращает минимум из трёх чиселю */
mport java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(min(a,b,c));
    }


    static int min(int a, int b, int c) {
        if (a<b&&a<c) return a;
        else if (b<a&&b<c) return b;
        else return c;

    }


}



      

