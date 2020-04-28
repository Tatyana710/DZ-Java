/*
task_2.9
Напишите фрагмент кода, который принимает от пользователя число и если число чётное, то программа выводит
на экран число, котрое больше введённого с клавитатуры на 10, в противном случае выводит на экран число 
в 10 раз больше введённого
*/
import jdk.dynalink.beans.StaticClass;

public class Main {
    public static void main(String[] args) {
        int[] nums= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = nums[0];
        int mod= a%2;
                for (int i = 0;i<10; i++) {
            if (mod==0); a=nums[i]+10;
            System.out.println(a);
            if (mod!=0); a=nums[i]*10;
            System.out.println(a);
        }

    }
}


