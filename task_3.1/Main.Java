/* Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите "Да", а если нет - выведите "Нет"*/
    
public class Main {
    public static void main(String[] args) {
     int[] nums = {3, 13, 5, 34, 47, 55};
        int a = nums[0];
        System.out.println("Да");
        System.out.println("Нет");
        for (int i = 0; i < 6; i++) {
            a += nums[i];
            if (nums[i] == 5) ;
            if (nums[i] != 5) ;


        }
    }
}
