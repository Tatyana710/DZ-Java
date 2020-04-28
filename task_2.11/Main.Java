/*task_2.11
В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую, вторую, третью или четвёртую).
*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 13, 19, 34, 47, 55};
        int min = nums[0];
        for (int i = 0; i < 60; i++) {
            if (min < 15) min = nums[i];
            System.out.println("Четверть 1:"+ min);
            if (min < 30) min = nums[i];
            System.out.println("Четверть 2:" + min);
            if (min < 45) min = nums[i];
            System.out.println("Четверть 3:" + min);
            if (min < 60) min = nums[i];
            System.out.println("Четверть 4:" + min);

        }

    }
}


