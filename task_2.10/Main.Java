/*task_2.10
назовём "весом числа" сумму его цифр. Напишите код, 
который принимает от пользователя число и выводит на экран его "вес".
*/
public class Main {
public static void main(String[] args) {
    int[] nums={2,4,6,8,9};
    double sum=0;
     for (int i = 0;i<5; i++) {
         sum += nums[i];
     }
        System.out.println(sum/5);
        }

    }
