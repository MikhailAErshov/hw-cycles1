//Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе выполнения программы.

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String [] array = new String[10];
        for (int i = 0; i < 10; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите элемент массива № " + i + ":");
            String elementArray = sc1.next();
            array[i] = elementArray;
        }
        System.out.println("Полученный массив: " + Arrays.toString(array));
    }
}
