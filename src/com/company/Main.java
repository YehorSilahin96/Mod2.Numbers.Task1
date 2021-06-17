package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //output
        final Pattern MARKUP = Pattern.compile("%-24s| %-9s| min = %,-27d| max = %,-27d|"); //Added constant Pattern
        String s;

        s = String.format(String.valueOf(MARKUP), Byte.class, "1 byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(s); // print(), println(), write(), format();


        s = String.format(String.valueOf(MARKUP), Short.class, "2 bytes", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(s);


        s = String.format(String.valueOf(MARKUP), Integer.class, "4 bytes", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(s);


        s = String.format(String.valueOf(MARKUP), Long.class, "8 bytes", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(s);

    }
}
