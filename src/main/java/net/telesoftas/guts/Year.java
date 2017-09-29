package net.telesoftas.guts;

public class Year {

    public static boolean isLeap(int year) {
        if (year < 1) {
            throw new IllegalArgumentException();
        }
        return divisibleBy4(year)
                && notDivisibleBy100(year)
                || divisibleBy400(year);
    }

    private static boolean divisibleBy4(int year) {
        return year % 4 == 0;
    }

    private static boolean notDivisibleBy100(int year) {
        return year % 100 != 0;
    }

    private static boolean divisibleBy400(int year) {
        return year % 400 == 0;
    }
}
