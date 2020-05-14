/* 1. Для вывода используйте только переменные из класса Constans.
2. В классе Ferrari реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
3. В класса Lanos реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
4. Создайте public static класс LuxuriousCar(роскошная машина).
5. создайте public static class CheapCar (дешёвая машина).
6. Унаследуйте Ferrari и Lanos от CheapCar и LuxiurousCar, подумайте, какой класс для кого.
7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводилна экран "Я хочу ездить на роскошной машине".
8.В классе CheapCar реализуйте метод printlnDesure, чтобы он выводил на экран "Я хочу ездить на дешёвой машине.
9. В классах LuxuriousCar и CheapCar для метода printlnDesure расставьте различными методами доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости
 */
public class Main {
    public static void main(String[] args) {
        new Main.LuxiurousCar(true).printlnDesire();
        new Main.CheapCar(false).printlnDesire();
        new Main.Ferrari(false).printlnDesire();
        new Main.Lanos(true).printlnDesire();
    }

    public static class Ferrari {
        String myCar = "Моя машина Ferrari";
        public Ferrari(boolean myCar){
         }
        public void printlnDesire() {
          System.out.println(myCar + Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos {
        String myCar1 = "Моя машина Ланос";
        public Lanos(boolean myCar1) {
        }
        public void printlnDesire() {
            System.out.println(myCar1 + Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class LuxiurousCar {
        String myCar2 = "Моя машина Luxiurous";
        public LuxiurousCar (boolean myCar2){

        }
        protected void printlnDesire() {
          System.out.println(myCar2 + Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        String myCar3 = "Моя Машина";
        public CheapCar(boolean myCar3) {
        }
        protected void printlnDesire() {

            System.out.println(myCar3+Constants.CHEAP_CAR);
        }
}
            public static class Constants {
                public static String WANT_STRING = " Я хочу ездить на ";
                public static String LUXURIOUS_CAR = " РОСКОШНОЙ МАШИНЕ";
                public static String CHEAP_CAR = " ДЕШЁВАЯ МАШИНА";
                public static String FERRARI_NAME = " Феррари";
                public static String LANOS_NAME = " Ланосе";
            }
        }

