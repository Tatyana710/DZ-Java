/*
выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16
*/
public class Main {
    public static void main(String[] args) {

        for(int x=0; x<4;x++) {
            for (int n = 0; n < 4; n++) {
                System.out.print((x + 1) * (n + 1));
            }
            {
                System.out.println();
            }
        }
        }

    static int pow(int x, int n) {
        if (n != 1) return pow(x, n );
        else return x;
    }
}
