/*
3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
*/
import java.util.Arrays;
import java.util.Collections;

class PY{
    
    public static void main(String[] args) {
        int [] mas = {1,-3,3,5,6,7,5,77,44};
       int sum = 0;
       System.out.println(Arrays.toString(mas));
        ExitMassive(mas, sum);
    
    }
    private static void ExitMassive(int [] mas,int sum) {
        for (int i = 0; i < mas.length; i++){
        if (mas[i]>=10 && mas[i]<=99){
            sum +=mas[i];
        }
    }

    for (int j = 0; j < mas.length; j++) {
            if(mas[j] < 0){
                mas[j] = sum;
            }

        }
        System.out.println(Arrays.toString(mas));
}
}
