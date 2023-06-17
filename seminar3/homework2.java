//Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Scanner;

public class PY {
     /**
      * @param args
      */
     public static void main(String[] args) {
          product product1 = new product("Средней", '3', 2, "Россия", 67);
          product product2 = new product("Средней", '2', 3, "Казахстан", 80);
          product product3 = new product("Высшей", '1', 4, "Беларусь", 30);
          product product4 = new product("Высшей", '1', 5, "Корея", 90);
          List<product> Listproduct = new ArrayList<>();
          Listproduct.add(product1);
          Listproduct.add(product2);
          Listproduct.add(product3);

     }

     private static void INPUTSort() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Введите сорт: ");
          String qual = sc.nextInt();

          String search = qual;
          Integer totalExportVolume = 0;

          List<Double> ListGeneral = new ArrayList<>();
          List<Double> ListProduct = new ArrayList<>();

          for (int i = 0; i < Listproduct.size(); i++) {
               List<Double> ListProduct = new ArrayList<>();
               if (Listproduct.get(1).getQuality().equals(search)) {
                    ListProduct.add(Listproduct.get(i).getName());
                    ListProduct.add(Listproduct.get(i).getPrice());

                    listGeneral.addAll(ListProduct);
               }
          }

     }

     List<Double> ListResult = new ArrayList<>();for(
     int i = 0;i<setGeneral.length+1;i++)
     {
          if (ListGeneral[i].getPrice() > ListGeneral[i + 1].getPrice()) {

               ListResult.add(ListGeneral[i]);
          }
     }

     for(
     int i = 0;i<ListResult.length;i++)
     {
          System.out.println(ListResult[i]);
     }
}
