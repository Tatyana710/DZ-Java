/*
Дфн массив с числами. Проверьтеб есть ли в нём два одинаковых числа подряд. Если есть-
выведите "да", а если нет-ыфыедите "нет".
*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 13, 10, 34, 47, 55};
        int a = nums[3];
        for (int i=0;i<6;i++) {
            a+=nums[i];
            if(nums[i]==a) System.out.println("Да"+nums[i]);
            if(nums[i]==a) System.out.println("Да"+nums[i]);
            if(nums[i]!=a) System.out.println("Нет"+nums[i]);



        }


    }

}
