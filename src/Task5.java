//Гражданин 1 марта открыл счет в банке, вложив 1000 руб. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
//за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
//через сколько месяцев размер вклада превысит 1200 руб.

public class Task5 {
    public static void main(String[] args) {
        double deposit = 1000;
        double holding = deposit;
        int monthDeposit = 0;
        int monthHolding = 0;
        double vklad;

        do {
            holding = holding * 1.02;
            vklad = (holding * 1.02) - holding;
            monthHolding++;
        }
        while (vklad < 30);

        System.out.println("За " + monthHolding + " месяц величина ежемесячного вклада превысит 30 руб.");

        do {
            deposit = deposit * 1.02;
            monthDeposit++;
        }
        while (deposit < 1200);

        System.out.println("Через " + monthDeposit + " месяцев размер вклада превысит 1200 руб.");
    }
}
