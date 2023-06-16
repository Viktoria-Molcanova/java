/* 
 *  Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
import java.util.Arrays;
class PY {

    public static void main(String[] args) {
        int [] array = new int[10];
 
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*90)+10;
        }
        System.out.println(Arrays.toString(array));
 
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
             if(array[i]<=array[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив возрастает");
        } else {
            System.out.println("Массив не возрастает");
        }
    }
}
