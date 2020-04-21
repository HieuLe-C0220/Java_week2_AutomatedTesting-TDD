public class NextDayCalculator {
    private static int day;
    private static int month;
    private static int year;
    public static int getDay() {
        return day;
    }
    public static void setDay(int day) {
        NextDayCalculator.day = day;
    }
    public static int getMonth() {
        return month;
    }
    public static void setMonth(int month) {
        NextDayCalculator.month = month;
    }
    public static int getYear() {
        return year;
    }
    public static void setYear(int year) {
        NextDayCalculator.year = year;
    }
    public static void nextDay(int day, int month, int year) {
        NextDayCalculator.day = day + 1;
        NextDayCalculator.month = month;
        NextDayCalculator.year = year;
        if (NextDayCalculator.day>dayOfMonth(month, year)) {
            NextDayCalculator.day = 1;
            if (month<12) {
                NextDayCalculator.month = month+1;
            } else {
                NextDayCalculator.month = 1;
                NextDayCalculator.year = year+1;
            }
        }
    }

    public static boolean checkLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    public static int dayOfMonth(int month,int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (checkLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
