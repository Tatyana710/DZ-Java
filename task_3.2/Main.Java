/* Дан массив с числами. Проверьте есть ли в нём два одинаковых числа подряд. Если есть-
выведите "да", а если нет-выведите "нет"*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 4, 10, 5, 7, 55};
        boolean a=false;
        for (int i = 1; i < 6; i++) {
            if (nums[i - 1] == nums[i]) a = true;
        }if(a) {
            System.out.println("да");
        } else if(!a) {
            System.out.println("нет");
        }
    }
}
