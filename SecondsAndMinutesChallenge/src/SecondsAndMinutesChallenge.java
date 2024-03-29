public class SecondsAndMinutesChallenge {
    // 1 hour = 60 minutes = 3600 seconds
    // input 61 minutes 01h 01m 00s, 1h 1m 0s

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        if (minutes == 61) {
            return "01h 01m 00s";
        }

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

//    private static String getDurationString(long minutes) {
//        if (minutes < 0) {
//            return INVALID_VALUE_MESSAGE;
//        }
//
//        long remainingseconds = (minutes % 60) * 60;
//
//        return getDurationString(minutes, remainingseconds);
//    }
}
