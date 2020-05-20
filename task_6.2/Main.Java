/* 1.Создать public static Goose (Гусь).
2. 2.Создать public static класс Dragon (Дракон).
3. 3.Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 4.Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 5. В классе Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
 6. В классе Goose метод getSize() должен возвращать строку "Гусь маленький," +[getSize родительского класса].
 7. В классе Dragon метод getSize() должен возвращать строку "Дракон большой,"+ [getSize родительского клсса].
 */
public class Main {
    public static void main(String[] args) {
        Goose goose = new Goose();
        Dragon dragon = new Dragon();
        System.out.println(goose.getSize());
        System.out.println(dragon.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }


    public static class Goose extends SmallAnimal {
       @Override
       public String getSize() {
           super.getSize();
           String size="Гусь маленький " + super.getSize();
            return size;
       }

    }

public static class Dragon extends BigAnimal {
    @Override
    public String getSize() {
        super.getSize();
       String size="Дракон большой "+super.getSize();
       return size;
     }
 }

}







