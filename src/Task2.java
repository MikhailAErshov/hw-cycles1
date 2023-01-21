//Напечатать числа с помощью цикла for следующим образом:
//	10 10.4
//	11 11.4
//	...
//	25 25.4

public class Task2 {
    public static void main(String[] args) {
        int firstNumber = 10;
        int lastNumber = 25;

        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.println(i + " " + (i+0.4));
        }
    }
}
