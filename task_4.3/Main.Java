/* Написать функцию, которая возвращает минимум из четырёх чисел. Функция min (a,b,c,d) должна(вызывать фугкцию min (a,b),
        которую разрабатывали в задаче 4.1 */
public class Main {
    public static void main(String[] args) {
        int a=7;
        int b=5;
        int c=2;
        int d=9;
        if (min(a,b) < (min(c,d))) min(a,b);
        System.out.println(min(a,b));
        System.out.println(min(c,d));

    }

    static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }
}



