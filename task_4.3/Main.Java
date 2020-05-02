/*
написать функцию, которая возвращает минимум из четырёх чисел. Функция min (a,b,c,d) должна(вызывать фугкцию min (a,b),
которую разрабатывали в задаче 4.1
*/
public class Main {
 public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c = 8;
        int d = 6;
        int z = min(7, 5);
        if (a < b && b < c) {
            System.out.println(a);
        }
        if (b < c && c < d) {
            System.out.println(b);
        }
        if (min(7, 5) < (min(8, 6))) z = min(7, 5);
        {
            System.out.println(min(7, 5));
        }
    } 
    {System.out.println(min(8,6));}


    static int min(int a, int b) {
       if (a>b) return b;
    else return a;
}
}
