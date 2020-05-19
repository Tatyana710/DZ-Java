/*Помогите коту обрести имя с помощью метода setName. */
public class Main {
    public static void main(String[] args) {
    Cat cat = new Cat();
        cat.setName("Жужжик");
        System.out.println(cat.name);
    }


     class Cat {
        private String name= "Безымянный кот";

        void setName(String name) {
            if (this.name != name) ;
            System.out.println("Безымянный кот");

        }

    }
}  
