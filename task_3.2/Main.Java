/* Дан массив с числами. Проверьте есть ли в нём два одинаковых числа подряд. Если есть-
выведите "да", а если нет-выведите "нет"*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 4, 10, 5, 7, 55};
        int a = nums[0];
        int b = nums[1];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=a;
            for (int j = 1; j < nums.length; j++) {
                nums[j]=b;
                if (nums[j] != nums[i]) a+= b;}}
                if(a==b) System.out.println("да");
           else if (a != b) System.out.println("нет");


        
