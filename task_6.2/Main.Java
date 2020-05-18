/* 1.Создать public static Goose (Гусь).
2. 2.Создать public static класс Dragon (Дракон).
3. 3.Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 4.Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 5. В классе Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
 6. В классе Goose метод getSize() должен возвращать строку "Гусь маленький," +[getSize родительского класса].
 7. В классе Dragon метод getSize() должен возвращать строку "Дракон большой,"+ [getSize родительского клсса].
 */public class Main{
    public static void main(String[]args){

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

        abstract class SmallAnimal {
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

            abstract String getSize(String smallsize);


            abstract class BigAnimal {
                String speak;
                boolean veget;
                byte pows;

                public BigAnimal(boolean veget, String speak, byte pows) {
                }

                boolean getVeget() {
                    return this.veget;
                }

                String getSpeak() {
                    return this.speak;
                }

                byte getPows() {
                    return this.pows;

                    public class Goose extends SmallAnimal {
                        String smallsize;

                        public Goose(boolean veget, String speak, byte pows, String smallsize) {
                            super(veget, speak, pows);
                            this.smallsize = smallsize;
                        }

                        @Override
                        boolean getVeget() {
                            return super.getVeget();
                        }

                        @Override
                        String getSpeak() {
                            return super.getSpeak();
                        }

                        @Override
                        byte getPows() {
                            return super.getPows();
                        }

                        @Override
                        String getSize(String smallsize) {
                            return "Гусь маленький";
                            System.out.println("Гусь маленький" + getSize(smallsize));
                        }

                        public class Dragon extends BigAnimal {
                            String bigsize;
                            String fire;

                            public Dragon(boolean veget, String speak, byte pows, String bigsize, String fire) {
                                super(veget, speak, pows);
                                this.bigsize = bigsize;
                                this.fire = fire;
                            }

                            @Override
                            boolean getVeget() {
                                return super.getVeget();
                            }

                            @Override
                            String getSpeak() {
                                return super.getSpeak();
                            }

                            @Override
                            byte getPows() {
                                return super.getPows();
                            }

                            @Override
                            String getSize(String bigsize) {
                                return "Дракон большой";
                                out.println("Дракон большой" + getSize(BigAnimal));
                            }
                        }
                    }
                }


