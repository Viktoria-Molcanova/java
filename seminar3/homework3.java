// Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
import java.util.ArrayList;
import java.util.List;
public class PY {

String name;
String author;
Double price;
Integer year;
Integer pgNum;



public PY(String string, String string2, double d, int i, int j) {
}

public static void main(String[] args) {

        PY b1 = new PY("Человек в футляре", "Чехов", 500, 1996, 300);
        PY b2 = new PY("Евгений Онегин", "Пушкин", 400, 2023, 200);
        PY b3 = new PY("Мёртвые души", "Гоголь", 250, 1800, 260);
        PY b4 = new PY("Конь с розовой гривой", "Астафьев", 150, 1999, 133);
        
        List<PY> PYList = new ArrayList<>();

        PYList.add(b1);
        PYList.add(b2);
        PYList.add(b3);
        PYList.add(b4);
        
        System.out.println(PYList);

        StringBuilder sortedPY = new StringBuilder();
        for (PY PY : PYList) {
            if (isPrime(PY.PgNum()) && PY.getAuthor().toLowerCase().contains("а")) {
                if (PY.getYear() >= 2010 && PY.getYear() <= 2023) {
                    sortedPY.append(PY.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedPY);
     }  

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
     
        return true;

    
}
}

