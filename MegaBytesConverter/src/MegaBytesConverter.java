public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // 1 MB = 1024 KB
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long megaBytes = kiloBytes / 1024;
            long remainderBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " +
                    remainderBytes + " KB");
        }
    }
}
