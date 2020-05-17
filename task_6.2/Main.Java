/* 1.Создать public static Goose (Гусь).
2. 2.Создать public static класс Dragon (Дракон).
3. 3.Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 4.Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 5. В классе Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
 6. В классе Goose метод getSize() должен возвращать строку "Гусь маленький," +[getSize родительского класса].
 7. В классе Dragon метод getSize() должен возвращать строку "Дракон большой,"+ [getSize родительского клсса].
 */
public class Main {
    public class Dragon {
        String speak;
        boolean veget;
        byte pows;
        String fire;

        public Dragon(String speak, boolean veget, byte pows, String fire) {
            this.speak = speak;
            this.veget = veget;
            this.pows = pows;
            this.fire = fire;
        }
    }

    public class Goose {
        String speak;
        boolean veget;
        byte pows;

        public Goose(String speak, boolean veget, byte pows) {
            this.speak = speak;
            this.veget = veget;
            this.pows = pows;
        }
    }

    public static void main(String[] args) {
        class BigAnimal {
            String speak;
            boolean veget;
            byte pows;
            public BigAnimal(boolean veget, String speak, byte pows) {
            }
            boolean getVeget(){return this.veget;}
            String getSpeak(){return this.speak;}
            byte getPows () {return this.pows;}
            void eat(){
            }
            
        }
    }
    class SmallAnimal {
        String speak;
        boolean veget;
        byte pows;

        public SmallAnimal(boolean veget, String speak, byte pows) {
        }

        boolean getVeget() {
            return this.veget;
        }

        String getSpeak() {
            return this.speak;
        }

        byte getPows() {
            return this.pows;
        }

        public class Goose extends SmallAnimal {
            String size;

            public Goose(boolean veget, String speak, byte pows, String size) {
                super(veget, speak, pows);
                this.size = size;
            }

            String getSize() {
                return "Гусь маленький";
            }

            public class Dragon extends BigAnimal {
                String size;
                String fire;

                public Dragon(boolean veget, String speak, byte pows) {
                    super(boolean veget, String speak,byte pows);
                    this.size = size;
                    this.fire = fire;
                }

                String getSize() {
                    return "Дракон большой";
                }
            }
        }
    }
