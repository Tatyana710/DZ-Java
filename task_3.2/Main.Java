/* Дан массив с числами. Проверьте есть ли в нём два одинаковых числа подряд. Если есть-
выведите "да", а если нет-выведите "нет"*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 10, 5, 55, 55};
        int a = nums[0];
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (nums[i] == nums[j]) System.out.println("Да");
                else System.out.println("Нет");
            }
        }
    }
}





        
