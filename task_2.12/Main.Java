/*
даны переменные a и b. Проверьте, что а делится на b без остатка. Если это так,
то выведите "Делится" и результат деления. Иначе выведите "Делится с остатком" и остатьк от деления.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double mod = a % b;
        if (mod == 0)
        System.out.println("Делится"+mod);
        if (mod!=0)
        System.out.println("Делится с остатком"+mod);
        }

    }
