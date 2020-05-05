/* Создать класс Cat. У кота должно быть имя(String name, int age,int weigth, int strength).
Создать объект класса Cat.
*/
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5,"Пушок",3,2);
        System.out.println("Привет! Я"+ cat.name+"!" +  "Mне" +cat.age +"лет !"+ "Мой вес" +cat.weight+"-кг !" +"Моя сила" +"-"+ cat.strength+"!");
    }
}

    class Cat {
        int age;
        String name;
        int weight;
        int strength;
        Cat(int age, String name, int weight, int strength) {
            this.age = 5;
            this.name = "Пушок";
            this.strength = 2;
            this.weight = 3;
        }
    }
