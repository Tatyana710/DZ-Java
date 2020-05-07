/*
Запросить у пользователя число (температуру в цельсиях) и записать его в переменную.
Программа должна переводить температуру и возвращать значение в градусах Фаренгейта. Температура по 
Цельсию ТС и температура по Фаренгейту TF связаны следующим соотношением: TF=(9/5)*TC+32.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int TC= scan.nextInt();
        double TF=(1.8)*TC+32;
        System.out.println(TF);
    }
}

