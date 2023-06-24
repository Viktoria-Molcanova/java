
// Пусть дан список сотрудников.Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
import java.util.ArrayList;
public class PY {
    public static void main(String[] args) {
        String[] EMPL = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Пётр Лыков", "Павел Чернов", "Пётр Чернышов", "Мария Фёдорова",
                "Марина Светлова", "Марина Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Пётр Петин", "Иван Ежов" };
        ArrayList<String> EMPLN = getName(EMPL);
        Map<String, Integer> MAP = getMap(EMPLN);
        System.out.println("Повторяющиеся имена с количеством повторений -  ");
        Rep(MAP);
        System.out.println("Сортировка по убыванию популярности -  ");
        Sort(MAP);
    }

    public static ArrayList<String> getName(String[] list) {
        ArrayList<String> listName = new ArrayList<>();

        for (String el : list) {
            String[] elList = el.split(" ");
            listName.add(elList[0]);
        }
        return listName;
    }

    public static Map<String, Integer> getMap(ArrayList<String> name) {
        Map<String, Integer> MAP = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j)))
                    count += 1;
            }
            if (MAP.containsKey(name.get(i)) == false)
                MAP.put(name.get(i), count);
        }
        return MAP;
    }

    public static void Rep(Map<String, Integer> map) {
        for (var item : map.entrySet()) {
            if (item.getValue() > 1)
                System.out.printf("%s: %d \n", item.getKey(), item.getValue());
        }
    }

    public static void Sort(Map<String, Integer> map) {
        Map<Integer, ArrayList<String>> sortMap = new HashMap<>();
        ArrayList<Integer> listCount = new ArrayList<>();
        for (var item : map.entrySet()) {
            if (listCount.contains(item.getValue()) == false)
                listCount.add(item.getValue());
        }
        listCount.sort(null);
        for (int i = listCount.size() - 1; i > -1; i--) {
            for (var item : map.entrySet()) {
                if (listCount.get(i) == item.getValue())
                    System.out.printf("%s : %d \n", item.getKey(), item.getValue());
            }
        }
    }

} 
