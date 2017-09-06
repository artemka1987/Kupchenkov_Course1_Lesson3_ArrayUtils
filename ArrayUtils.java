/**
 * Created by Artemka on 06.09.2017.
 */
public class ArrayUtils {


    // Метод получения минимального значения в массиве
    public static int getMinValueFromArray(int[] array){
        int minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Метод получения максимального значения в массиве
    public static int getMaxValueFromArray(int[] array){
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    // Метод нахождения среднего арифмитического для массива
    public static double getAverageValueFromArray(int[] array){
        int sumArrayElements = 0;
        for(int i = 0; i < array.length; i++){
            sumArrayElements += array[i];
        }
        return (double) sumArrayElements / array.length;
    }


}
