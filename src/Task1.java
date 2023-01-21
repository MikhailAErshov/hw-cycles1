//Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго введенного числа по абсолютной величине

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите второе число:");
        int y = sc2.nextInt();

        double z;

        if (Math.abs(x) > Math.abs(y)) {
            z = (double) (x) / 2;
            System.out.println("Первое число больше второго по абсолютной величине, поэтому оно поделено на 2 и его результат = " + z);
        } else System.out.println("Первое число меньше второго по абсолютной величине");
    }
}
