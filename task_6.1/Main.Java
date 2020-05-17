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
        new Main.LuxiurousCar("чёрный", "очень сильный").printlnDesire();
        new Main.CheapCar("жёлтый", "слабый").printlnDesire();
        new Main.Ferrari("Красный", "мощный").printlnDesire();
        new Main.Lanos("Белый", "не очень мощный").printlnDesire();
    }


    public static class Ferrari {
        String color1;
        String motor1;

        public Ferrari(String color1, String motor1) {
            this.color1 = color1;
            this.motor1 = motor1;
        }
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);

        }
    }
    public static class Lanos {
        String color2;
        String motor2;

        public Lanos(String color2, String motor2) {
            this.color2 = color2;
            this.motor2 = motor2;
        }

        static String getColor2() {return "Белый";}
        static String getMotor2() {return "не очень мощный";}

        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
            System.out.println(Constants.LANOS_NAME+" "+" "+Lanos.getColor2()+" "+" "+Lanos.getMotor2());

        }
    }

    public static class LuxiurousCar {
        String color3;
        String motor3;
        public LuxiurousCar(String color3, String motor3) {
            this.color3 = color3;
            this.motor3 = motor3;
        }
        static String getColor3() {return "Чёрный";}

        static String getMotor3() {return "очень мощный";}
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
            System.out.println("Лакшери"+""+LuxiurousCar.getColor3()+""+""+LuxiurousCar.getMotor3());

        }
    }

    public static class CheapCar {
        String color4;
        String motor4;
        public CheapCar(String color4, String motor4) {
            this.color4 = color4;
            this.motor4 = motor4;
        }
        String getColor4() {return "Жёлтый";}
        String getMotor4() {return "слабый";}
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING+" " + Constants.CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = " Я хочу ездить на ";
        public static String LUXURIOUS_CAR = " РОСКОШНОЙ МАШИНЕ";
        public static String CHEAP_CAR = " ДЕШЁВОЙ МАШИНE";
        public static String FERRARI_NAME = " Феррари";
        public static String LANOS_NAME = " Ланос";
    }

}


