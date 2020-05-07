/* В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число (в первую, вторую, третью или четвёртую)*/
public class Main {
    public static void main(String[] args) {
        int min = 3;
        if (min>0 && min < 14) System.out.println("Четверть 1:" + min);
            else if (min>15 && min < 29) System.out.println("Четверть 2:" + min);
            else if (min>30 && min < 44) System.out.println("Четверть 3:" + min);
            else if (min>45 && min < 60) System.out.println("Четверть 4:" + min);
            }
            }





