/*
Дфн массив с числами. Проверьтеб есть ли в нём два одинаковых числа подряд. Если есть-
выведите "да", а если нет-ыфыедите "нет".
*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 3, 10, 5, 47, 55};
        int a = nums[0];
        for (int i = 1; i <nums.length; i++) {

            if (a >nums[i]) a += nums[i];
                {
                    if (nums[i] == nums[i] + 1) {
                        System.out.println("Да");
                     }else
                {  if (nums[i] != nums[i] + 1) ;
                        {
                            System.out.println("Нет");
                        }
                    }
                }
            }
        }
    }






        
