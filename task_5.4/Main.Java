/* Создать класс Dog. У собаки должна быть кличка String name и возраст int age.
*Создайте геттеры и сеттеры для всех переменных класса Dog.
* Создайте объект Dog  */

public class Main {
    public static void main(String[] args) {
        Dog Alex = new Dog( "Alex", 4);
       Alex.setDog("Alex", 4);
        System.out.println(Alex.getName());
        System.out.println(Alex.getAge());
    }
    }

     class Dog {
         private static int age;
         private static String name;


         public Dog(String name, int age) {
             this.name = name;
             this.age = age;
         }

         static int getAge() {
             return age;
         }

         static String getName() {
             return name;
         }


        static void setDog(String name, int age) {
            if (name!="Alex")
            if (age!=4)
            System.out.println("Это Alex: ");
            else System.out.println("Это не Alex");
    }



         }



