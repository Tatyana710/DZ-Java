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
        Goose goose = new Goose("Га-га-га", true, 2, "гусь маленький");
        Dragon dragon = new Dragon("огонь",false, 4, "дракон боольшой");
    }
    public static class Goose {
        String speak;
        boolean veget;
        String size;
        int pows;

        public Goose(String speak, boolean veget, int pows, String size) {
            this.speak = speak;
            this.veget = veget;
            this.pows = pows;
            this.size = size;
            System.out.println("Гусь маленький"+getSize());
        }
    }
        public static class Dragon{
            String fire;
            boolean veget;
            int pows;
            String size;
            public Dragon( String fire, boolean veget,int pows, String size){
                this.fire=fire;
                this.veget=veget;
                this.pows=pows;
                this.size=size;
                System.out.println("Гусь маленький" );
            }

        }

    class Gooose extends SmallAnimal {
        String smallsize;
        boolean veget;
        String speak;
        byte pows;
    public SmallAnimal(boolean veget, String speak, byte pows, String smallsize) {
            super(veget, speak, pows, smallsize);
            this.veget = veget;
            this.smallsize = smallsize;
            this.speak = speak;
            this.pows = pows;
            System.out.println("Гусь маленький" + Goose.getSize());
        }
    }
}









