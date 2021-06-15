package com.company;

public class Main {

    public static void main(String[] args) {

        String s = "";

    //OUTPUT
        s = String.format("%-24s| %-9s| min = %,-27d| max = %,-27d|",
                Byte.class, "1 byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(s);


        s = String.format("%-24s| %-9s| min = %,-27d| max = %,-27d|",
                Short.class, "2 bytes", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(s);


        s = String.format("%-24s| %-9s| min = %,-27d| max = %,-27d|",
                Integer.class, "4 bytes", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(s);


        s = String.format("%-24s| %-9s| min = %,-27d| max = %,-27d|",
                Long.class, "8 bytes", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(s);

    }
}
