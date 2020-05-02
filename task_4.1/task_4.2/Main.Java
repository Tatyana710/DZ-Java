/*
Написать фугкцию, которая возвращает минимум из трёх чиселю
*/
public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c = 3;
        if (a > b && b>c) System.out.println(c);
        if (a < b && b<c) System.out.println(a);
        if (b < a && a<c) System.out.println(b);
    }

    static void min(int a, int b, int c) {
        return;

    }
}
