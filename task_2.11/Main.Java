/*task_2.11
В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую, вторую, третью или четвёртую).
*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 13, 19, 34, 47, 55};
        int min = nums[0];//число 3
        System.out.println("Четверть1:");
        for (int i = 0; i < 6; i++) {
            min+=nums[i];
            if (nums[i] < 15) min = nums[i];
            System.out.println(nums[i]);
            System.out.println("Четверть2:");
            if (nums[i] <30) min = nums[i];
            System.out.println(nums[i]);
            System.out.println("Четверть3:");
            if (nums[i]<45) min=nums[i];
            System.out.println(nums[i]);
            System.out.println("Четверть4:");
            if (nums[i]<60) min=nums[i];
            System.out.println(nums[i]);
        }


    }

}
