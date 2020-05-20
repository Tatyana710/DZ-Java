/*1.Создайте public static MarkTwainBook,который наследуется от Book. Имя автора
[Mark Twain].
Параметр конструктора  - название книги [title].
2. В классе MArkTweinBook ревлизуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AghataChristieBook имя автора [Aghata Christie].
5. В классе Book ревлизуйте тело метода getOutByBookType так, чтобы он возвращал:
5.1 AghataChristieOutput для книги Агаты Кристи;
5.2 MArkTweinOutput для Марка Твена.*/
import java.awt.print.Book;
import java.util.LinkedList;
public class Main{
    public static void main (String []args){
        List <book> books=new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawer"));
        books.add(new AghataChristieBook("Hercule Poirot"));
        System.out.println(books);
    }
    abstract static class Book{
        private String author;
        public Book(String author){
            this.author=author
        }
        public abstract Book getBook();
        public abstract String getTitle();
        private String getOutputByBookType(){
            String agathaChristieOutput = author+":"+getBook().getTitle()+"is a detective";
            String markTwainOutput = getBook().getTitle()+"was written by"+author;
            String output="output";
            //код
            return output;
            public String toString(){
                return getOutByBookType();
            }
        }
    }
}












