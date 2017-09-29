package net.telesoftas.guts;

public class Year {

    public static boolean isLeap(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Year has to be bigger than 0");
        }
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
