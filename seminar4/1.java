//Вывести список на экран в перевернутом виде (без массивов и ArrayList)
public class PY {

     /**
      * @param args
      */
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Введите данные:");
          String number = sc.nextLine();
          System.out.println("Результат:" + reverseString(number));

     }

     public static String reverseString(String number) {
          return new StringBuilder(number).reverse().toString();
     }

}
