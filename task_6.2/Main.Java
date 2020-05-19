/* 1.Создать public static Goose (Гусь).
2. 2.Создать public static класс Dragon (Дракон).
3. 3.Унаследовать класс Goose от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 4.Унаследовать класс Dragon от BigAnimal или SmallAnimal, подумать, какой логически больше подходит.
 5. В классе Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
 6. В классе Goose метод getSize() должен возвращать строку "Гусь маленький," +[getSize родительского класса].
 7. В классе Dragon метод getSize() должен возвращать строку "Дракон большой,"+ [getSize родительского клсса].
 */
import Dragon.Dragon;
import Goose.Goose;

public class Main {
    public static void main(String[] args) {
        Goose goose = new Goose("Га-га-га",true,2,"как кошка");
        Dragon dragon =new Dragon(false,4, "огонь","дракон боольшой");


            class SmallAnimal {
                String smallsize;
                boolean veget;
                String speak;
                byte pows;

                public SmallAnimal(boolean veget, String speak, byte pows, String smallsize) {
                    this.veget = veget;
                    this.smallsize = smallsize;
                    this.speak = speak;
                    this.pows = pows;
                }

                 boolean getVeget() {return this.veget;}
                String getSpeak(){return this.speak;}
                byte getPows (){return this.pows;}
                static String getSize() {return "как кошка";}

                class BigAnimal {
                    public BigAnimal(boolean veget, String fire, byte pows, String bigsize) {
                        this.veget1 = veget;
                        this.pows1 = pows;
                        this.fire1 = fire;
                        this.bigsize= bigsize;
                    }

                    boolean getVeget() {return this.veget;}
                            String getFire(){return this.fire;}
                            byte getPows (){return this.pows;}
                            protected String getSize() {return "как динозавр";}

                         class Goose extends SmallAnimal {
                            String smallsize;
                            public Goose(boolean veget, String speak, byte pows, String smallsize) {
                                super(veget,speak,pows);
                                this.smallsize=smallsize;

                                System.out.println("Гусь маленький" + Goose.getSize());
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

                             class Dragon extends BigAnimal {
                               public Dragon(boolean veget, byte pows, String bigsize, String fire) {
                                    super(veget, fire, pows, bigsize);

                                    System.out.println("Дракон большой" + Dragon.getSize());
                                }

                                @Override
                                boolean getVeget() {
                                    return super.getVeget();
                                }

                                @Override
                                String getFire() {
                                    return super.getFire();
                                }

                                @Override
                                byte getPows() {
                                    return super.getPows();
                                }
                            }
                        }
                    }
                }
            }


}






