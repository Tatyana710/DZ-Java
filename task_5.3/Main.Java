/*Реализовать метод boolean fight(Cat anotherCat):
* реализовать механизм драки котов в зависимости от их веса, возраста и силы.
* Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
* Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
* Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
* если cat1.fight(cat2) возвращает true,
* то cat2.fight(cat1) должен возвращать false. */
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat (5, 4, 3, true);
        Cat cat2 = new Cat(4, 3, 2, false);
        if (cat1.fight(cat2)) System.out.println("Выиграл: " + cat1.fight(cat2));
        else System.out.println(cat2);
        if (cat2.fight(cat1)) System.out.println("Выиграл: " + cat2.fight(cat1));
        else System.out.println(cat1.fight(cat2));
        if ((cat1.fight(cat2)) == cat2.fight(cat1)) System.out.println("Ничья");

    }
}
        class Cat {
            String name;
            int age;
            int weight;
            int strength;
            Cat(int age, int weight, int strength) {
                this.age = age;
                this.weight = weight;
                this.strength = strength;

            }
            public boolean fight(Cat anotherCat) {

                int i = 0;
                int j = 0;
                anotherCat.age = age;
                anotherCat.weight = weight;
                anotherCat.strength = strength;
                if (this.age > anotherCat.age)
                    i++;
                if (this.age < anotherCat.age)
                    j--;
                if (this.weight > anotherCat.weight)
                    i++;
                if (this.weight < anotherCat.weight)
                    j--;
                if (this.strength > anotherCat.strength)
                    i++;
                if (this.strength < anotherCat.strength) {
                    j--;
                }
                if (i == j) return true;
                if (i > j) return true;
                if (i < j) return false;
                return false;
            }
            }
