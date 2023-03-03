public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // true and (barking < 8 or barking > 22)
        // hourOfDay < 0 or hourOfDay > 23
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;

        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;

        } else {
            return false;
        }
    }
}