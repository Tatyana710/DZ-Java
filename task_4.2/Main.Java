/* Написать функцию, которая возвращает минимум из трёх чиселю */
public class Main {
    public static void main(String[] args) {
        int a = min(7);
        int b = min(5);
        int c = min(3);
        if (min(a) > min(b) && min(b) > min(c)) System.out.println(min(c));
        if (min(a) < min(b) && min(b) < min(c)) System.out.println(min(a));
        if (min(a) > min(c) && min(c) > min(b)) System.out.println(min(b));


    }

    private static int min(int i) {
        return 0;
    }

    static int min ( int a, int b, int c){
            if (a > b && b > c) return (c);
            else if (c > b && b > a) ;
            else if (a > c && c > b) ;
            return a;
        }
    }

