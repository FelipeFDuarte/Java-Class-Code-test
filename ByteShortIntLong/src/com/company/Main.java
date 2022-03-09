package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinIntValue);
        System.out.println("Integer Maximum Value = "+ myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value =" + myMinByteValue);
        System.out.println("Byte maximum value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value =" + myMinShortValue);
        System.out.println("Short maximum value =" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value =" + myMinLongValue);
        System.out.println("Long maximum value =" + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("The Number using L to make Java work :  " + bigLongLiteralValue);
        /*The Number couldn´t be read, because the L wasn´t inserted. To do it we neew to put L (using capital L) to make the code work. */

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);
    }
}
