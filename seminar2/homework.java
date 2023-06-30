/*
 *  1)Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
import java.util.*;

class PY

{

    static int SUM(int arr[], int n) {
        int array = Arrays.stream(arr).max().getAsInt();
        Vector<Boolean> prime = new Vector<>(array + 1);
        for (int i = 0; i < array + 1; i++)
            prime.add(i, Boolean.TRUE);

        prime.add(0, Boolean.FALSE);
        prime.add(1, Boolean.FALSE);
        for (int p = 2; p * p <= array; p++) {
            if (prime.get(p) == true) {
                for (int i = p * 2; i <= array; i += p)
                    prime.add(i, Boolean.FALSE);
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++)
            if (prime.get(arr[i]))
                sum += arr[i];

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);

        }

        System.out.print(SUM(arr, n)+"сумма простых чисел");
    }

}


