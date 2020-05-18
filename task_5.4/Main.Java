/* Создать класс Dog. У собаки должна быть кличка String name и возраст int age.
*Создайте геттеры и сеттеры для всех переменных класса Dog.
* Создайте объект Dog  */
 Dog dog = new Dog( "Boss", 4);
        dog.setAge(4);
        dog.setName("Alex");
        System.out.println("Кличка:" + dog.getName());
        System.out.println("Возраст:"+dog.getAge());
    }
}

class Dog {

    private int age;
    private String name;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    void setAge(int age) {
        if(age!=this.age)
        System.out.println("Это не Alex!");

    }

    void setName(String name) {
        if (name!=this.name)
System.out.println("Это не Alex!");
    }

}
