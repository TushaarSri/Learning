package com.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Mininmun value = "+minValue);
        System.out.println("Mininmun value overflow = "+(minValue-1));
        System.out.println("Maximum value = "+maxValue);
        System.out.println("Maximum value overflow = "+(maxValue+1));

        byte minbyte = Byte.MIN_VALUE;
        System.out.println("Min Byte "+minbyte);
        byte maxbyte = Byte.MAX_VALUE;
        System.out.println("Max Bite "+maxbyte);

        short minShort = Short.MIN_VALUE;
        System.out.println("Min Short "+minShort);
        short maxShort = Short.MAX_VALUE;
        System.out.println("Max Short "+maxShort);

        long myLongValue = 100L; /*Upper case L is required*/
        long minLong = Long.MIN_VALUE;
        System.out.println("Min Long "+minLong);
        System.out.println("Long "+myLongValue);
        long maxLong = Long.MAX_VALUE;
        System.out.println("Max Long "+maxLong);

        byte bytenumber = 121;
        short shortnumber = 3232;
        int intnumbrt = 1234;
        long longnumber = 50000L + 10L * (bytenumber + shortnumber + intnumbrt);
        System.out.println("Long number "+longnumber);


        /*Float and Double */
        float mymaxFloat = Float.MAX_VALUE;
        float myminFloat = Float.MIN_VALUE;
        System.out.println("My Max Float  "+mymaxFloat);
        System.out.println("My Min Float  "+myminFloat);

        double mymaxdouble = Double.MAX_VALUE;
        double mymindouble = Double.MIN_VALUE;
        System.out.println("My Max Double = "+mymaxdouble);
        System.out.println("My Min Double = "+mymindouble);

    }
}
