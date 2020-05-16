/*
Написать функцию, которая возвращает минимум из двух чисел.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(min (a,b));
        System.out.println(min (a,b));
    }

    private static int min(int a, int b) {
        if (a<b) return a;
        else return b;

    }


    }

