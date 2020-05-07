/* Написать функцию, которая возвращает минимум из четырёх чисел. Функция min (a,b,c,d) должна(вызывать фугкцию min (a,b),
        которую разрабатывали в задаче 4.1 */
public class Main {
    public static void main(String[] args) {
        int z = min(7, 5);
        int y = min(8, 6);
        if (min(7, 5) < (min(8, 6))) z = min(7, 5);
        System.out.println(min(7, 5));
        System.out.println(min(8, 6));

    }

    static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }
}



