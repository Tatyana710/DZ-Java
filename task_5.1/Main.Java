/*Помогите коту обрести имя с помощью метода setName. */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужжик");
        System.out.println(cat.name);
    }


    static class Cat {
        private String name = "Безымянный кот";

        public void setName(String name) {
            this.name = name;
            System.out.println("Безымянный кот");


            }


        }
    }
