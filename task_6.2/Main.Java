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

       public static class Goose {
            String speak;
            boolean veget;
            byte pows;

            public Goose(String speak, boolean veget, byte pows) {
                this.speak = speak;
                this.veget = veget;
                this.pows = pows;
            }

            public static class Dragon {
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

                 static class SmallAnimal {
                    public SmallAnimal(boolean veget, String speak, byte pows) {
                    }

                    static String getSize() {
                        return "как кошка";

                    }

                     static class BigAnimal {
                        public BigAnimal(boolean veget, String speak, byte pows) {
                        }

                        protected static String getSize() {
                            return "как динозавр";
                        }

                        public class Goose extends SmallAnimal {
                            String smallsize;

                            public Goose(boolean veget, String speak, byte pows, String smallsize) {
                                super(veget, speak, pows);
                                this.smallsize = smallsize;
                                System.out.println("Гусь маленький" + Goose.getSize());
                            }

                            public  class Dragon extends BigAnimal {
                                String bigsize;
                                String fire;

                                public Dragon(boolean veget, String speak, byte pows, String bigsize, String fire) {
                                    super(veget, speak, pows);
                                    this.bigsize = bigsize;
                                    this.fire = fire;
                                    System.out.println("Дракон большой" + Dragon.getSize());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


