package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            System.out.println(28 + (month + month / 8) % 2 + 2 % month + 1 / month * 2);
        } else {
            System.out.println("wrong number!");
        }
    }
}
