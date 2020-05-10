/* Написать функцию, которая возвращает минимум из трёх чиселю */
public class Main {
    public static void main(String[] args) {
        int a = min(7);
        int b = min(5);
        int c = min(3);
        System.out.println(min(7,5,3));
    }
    private static int min(int i) {
        return i;
    }
    static int min(int a, int b, int c) {
            if (a > b || b > c) return (c);
            else if (c > a || a > b) return b;
            else if (c > a || b > a) return a;
            return min (a, b, c);
        }
}

      

