/* Вывести на экран все возможные комбинации слов "мама", "мыла", "раму".
*/
public class Main {
    public static void main(String[] args) {
        String[] stroka = {"Мама Мыла Раму"};
        for (int i = 0; i < stroka.length; i++) {
           for (int j = 0; j < stroka.length; j++) { 
               if(i!=j){
            System.out.print(stroka[i]+stroka[j]+stroka[3-(i+j)]);


          }
    }

}

    
