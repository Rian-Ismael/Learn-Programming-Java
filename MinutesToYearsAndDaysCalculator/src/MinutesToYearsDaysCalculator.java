public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long toHour = minutes / 60;
            long toDays = toHour / 24;
            long toYear = toDays / 365;

            long remainingDays = toDays % 365;
            System.out.println(minutes + " min = " + toYear + " y" +
                    " and " + remainingDays + " d");
        }
    }
}
