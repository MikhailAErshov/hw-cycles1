//Найти максимальное из натуральных чисел, не превышающих 5000, которое нацело делится на 39. Используйте цикл с пост- или предусловием

public class Task3 {
    public static void main(String[] args) {
        int start = 0;
        int end = 5000;
        int maxNumber = 0;

        while (start < end) {
            if (start % 39 == 0) {
                maxNumber = start;
            }
            start++;
        }
        System.out.println("Максимальное число = " + maxNumber);
    }
}
