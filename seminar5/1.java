class PY {

/**
* @param {string} s
* @return {boolean}
*/
public static void main(String[] args){
String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
      text = text.replaceAll("[—][,|.]|\\p{Punct}", " ");
      while (text.contains("  ")){
          text = text.replace("  ", " ");
      }

      String WORD = "Россия";

      String[] arrayText = text.split(" ");
      Map<String, Integer> map = new HashMap<>();
      for (String currentWord : arrayText){
          if (!WORD.toLowerCase().equals(currentWord.toLowerCase())){
              continue;
          }

          int count = map.getOrDefault(WORD.toLowerCase(), 0);
          map.put(currentWord.toLowerCase(), ++count);
      }

      System.out.println("Количество слова Россия  -  " + map.getOrDefault(WORD.toLowerCase(), 0));

  }
public static Map<String, Integer> getCountWords(String[] array){
      Map<String, Integer> map = new HashMap<>();

      for (String current : array){
          int count = map.getOrDefault(current.toLowerCase(), 0);
          map.put(current.toLowerCase(), ++count);
      }

      return map;
  }
  public static void getKey(){
      String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
      text = text.replaceAll("[,|.]|\\p{Punct}", " ");
      while (text.contains("  ")){
          text = text.replace("  ", " ");
      }
      String[] arrayText = text.split(" ");

      Map<String, Integer> map = getCountWords(arrayText);

      for(Map.Entry<String, Integer> entry : map.entrySet()){
          System.out.println(entry.getKey() + " - " + entry.getValue());
      }
  }

  
}


