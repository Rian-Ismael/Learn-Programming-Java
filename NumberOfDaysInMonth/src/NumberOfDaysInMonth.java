public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } return false;
    }
    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        boolean verified = isLeapYear(year);
        if (verified && month == 2) {
            return 29;
        }

        int dayput = 0;
        switch(month) {
            case 1:
                dayput = 31;
                break;

            case 2:
                dayput = 28;
                break;

            case 3:
                dayput = 31;
                break;

            case 4:
                dayput = 30;
                break;

            case 5:
                dayput = 31;
                break;

            case 6:
                dayput = 30;
                break;

            case 7:
                dayput = 31;
                break;

            case 8:
                dayput = 31;
                break;

            case 9:
                dayput = 30;
                break;

            case 10:
                dayput = 31;
                break;

            case 11:
                dayput = 30;
                break;

            default:
                dayput = 31;
                break;

        }
        return dayput;
    }
}