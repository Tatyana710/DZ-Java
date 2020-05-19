/*Помогите коту обрести имя с помощью метода setName. */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужжик");
        System.out.println(cat.name);
    }


    public static class Cat {
        private String name= "Безымянный кот";
           void setName(String name) {
           this.name=name;
            if(this.name==name)
           System.out.println("Безымянный кот");



        }

    }
}
