/* Создать класс Dog. У собаки должна быть кличка String name и возраст int age.
*Создайте геттеры и сеттеры для всех переменных класса Dog.
* Сщздайте объект Dog  */

public class Main<dog> {
    public static void main(String[] args) {
        Dog Alex = new Dog( "Alex", 4);
        System.out.println(Dog.getName("Alex"));
       System.out.println(Dog.getAge(4));
    }

    public static <dog> void setDog() {
        Object dog;

    }

    private static class Dog {
            String name;
            int age;


            public Dog(String name, int age) {
                this.name=name;
                this.age = age;
            }

              static int getAge(int age ) {
                return age;
            }
            static String getName(String name){
                return name;
}
        }

    }

