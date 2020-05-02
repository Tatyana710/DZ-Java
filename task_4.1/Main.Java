/*
Написать функцию, которая возвращает минимум из двух чисел.
*/
public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        if (a > b) System.out.println(b);
        if (a < b) System.out.println(a);
    }

    static int min(int a, int b) {
        if (a>b) return (a);
        else return (b);

    }
}
