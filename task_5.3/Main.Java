/*Реализовать метод boolean fight(Cat anotherCat):
* реализовать механизм драки котов в зависимости от их веса, возраста и силы.
* Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
* Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
* Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
* если cat1.fight(cat2) возвращает true,
* то cat2.fight(cat1) должен возвращать false. */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat (5, 4, 3);
        Cat cat2 = new Cat(2, 3, 2);
        if (cat1.fight(cat2)) System.out.println("Выиграл Cat1: " +cat1.fight(cat2) );
        if (cat2.fight(cat1)) System.out.println("Выиграл Cat2: " + cat2.fight(cat1));

    }
}
class Cat {
    int age;
    int weight;
    int strength;
   Cat (int age, int weight, int strength) {
       this.age = age;
       this.weight = weight;
       this.strength = strength;

    }

    public boolean fight(Cat anotherCat) {
        int i = 0;
        int j = 0;
       if (this.age > anotherCat.age)
            i++;
        else if (this.age < anotherCat.age)
            j++;
        if (this.weight > anotherCat.weight)
            i++;
        else if (this.weight < anotherCat.weight)
            j++;
        if (this.strength > anotherCat.strength) {
            i++;

        if (this.strength < anotherCat.strength) {
                j++;
            }

        }

        if (i > j) return true;
        else return false;
   }

}




