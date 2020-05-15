/* Создать класс Human. С полями имя (String), пол(boolean), возраст (int),
отец (Human), мать (Human). Создай объекты и заполни их так, чтобы получилось:
 две бабушки, отец, мать, трое детей. вывести объекты на экран
 *Примечание:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол:мужской, возраст:2, отец: Михаил, мать: Аня
 */
public class Main {
    public static void main(String[] args) {
        Human grandMa1 = new Human("Ольга", true, 65);
        Human grandFa1 = new Human("Николай", false, 69);
        Human grandMa2 = new Human("Катя", true, 55);
        Human grandFa2 = new Human("Павел ", false, 60);
        Human mother = new Human("Аня", true, 21, grandFa1, grandMa1);
        Human father = new Human("Михаил", false, 22, grandFa2, grandMa2);
        Human child1 = new Human("Михаил", false, 22, father , mother);
        Human child2 = new Human("Аня", true, 21, father , mother);
        Human child3 = new Human("Игорь", false, 2, father , mother);
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}