import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Artemka on 06.09.2017.
 */
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arraySize;

        Random random = new Random();
        System.out.println("Введите размер масива");
        arraySize = readPositiveIntValueFromConsole();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        System.out.println("Минимальное значение: " + ArrayUtils.getMinValueFromArray(array) + ", Максимальное значение: " + ArrayUtils.getMaxValueFromArray(array) +
                           ", Среднее значение: " + ArrayUtils.getAverageValueFromArray(array));

    }


    // Метод считывания положительных int с консоли
    public static int readPositiveIntValueFromConsole(){
        int arraySize = 0;
        do{
            while (!scanner.hasNextInt()){
                System.out.println("Вы неверно ввели число , попробуйте еще раз...");
                scanner.next();
            }
            arraySize = scanner.nextInt();
            if (arraySize <= 0){
                System.out.println("Число должно быть положительным");
            }
        }while (arraySize <= 0);
        return arraySize;
    }

}
