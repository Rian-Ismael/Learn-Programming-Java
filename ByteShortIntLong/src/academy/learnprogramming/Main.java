package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myIntMINValue = Integer.MIN_VALUE;
        int myIntMAXValue = Integer.MAX_VALUE;
        System.out.println("Int Minimum Value = " + myIntMINValue);
        System.out.println("Int Maximum Value = " + myIntMAXValue);
        System.out.println("Busted Maximum Value = " + (myIntMAXValue + 1));
        System.out.println("Busted Minimum Value = " + (myIntMINValue - 1));

        int myIntMAXValueTest = 2_147_483_647;

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Minimum Value = " + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);

        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);


        int myTotal = (myIntMAXValue / 2);
        byte myNewValueByte = (byte) (myMinByteValue / 2);

        byte myValueByte = 10;
        short myValueShort = 20;
        int myValueInt = 30;
        long myValueLong = 50_000L;
        long myValueLongTotal = myValueLong + ((myValueByte + myValueShort + myValueInt) * 10);
        System.out.println(myValueLongTotal);

        short Total = (short) (myValueLong + ((myValueByte + myValueShort + myValueInt) * 10));
    }
}