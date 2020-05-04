/*
выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16
*/
public class Main {
    public static void main(String[] args) {
        int x = 1;
        int n = 5;
        System.out.println(pow(x, n)+ " 2 3 4");

        if (x > 0 || x <= 10) x++;
        {
            System.out.println(pow(x, n)+ " 4 6 8");
        }


        {
            System.out.println(pow(x + 1, n)+" 6 9 12" );
        }

        System.out.println(pow(x + 2, n)+ " 8 12 16");
    }


    static int pow(int x, int n) {
        if (n != 1) return pow(x, n - 1);
        else return x;
    }
}
