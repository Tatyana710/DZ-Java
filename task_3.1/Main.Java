/* Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите "Да", а если нет - выведите "Нет"*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 8, 47, 67};
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
           if (nums[i] == 5) a=5;}
        if (a==5){System.out.println("дa");}
        else {System.out.println("нет");}

        }
    }
