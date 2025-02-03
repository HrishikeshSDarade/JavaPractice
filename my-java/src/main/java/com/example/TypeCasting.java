package com.example;

public class TypeCasting {
    public static void main(String[] args) {

        byte a = 1;
        short b = a; //implicit type casting : byte to short
        int c = a; //implicit type casting : short to int
        long d = a; //implicit type casting : int to long
        float e = a; //implicit type casting : long to float
        double f = a; //implicit type casting : float to double

        System.out.println("byte value  : " + a);
        System.out.println("byte after converting to short : " + b);
        System.out.println("byte after converting to int : " + c);
        System.out.println("byte after converting to long : " + d);
        System.out.println("byte after converting to float : " + e);
        System.out.println("byte after converting to double : " + f);

        System.out.println("-------------------------------------------------");

        short g = 1;
        int h = g; //implicit type casting : short to int
        long i = g; //implicit type casting : int to long
        float j = g; //implicit type casting : long to float
        double k = g; //implicit type casting : float to double

        System.out.println("short value  : " + g);
        System.out.println("short after converting to int : " + h);
        System.out.println("short after converting to long : " + i);
        System.out.println("short after converting to float : " + j);
        System.out.println("short after converting to double : " + k);

        System.out.println("-------------------------------------------------");

        int l = 1;
        long m = l; //implicit type casting : int to long
        float n = l; //implicit type casting : long to float
        double o = l; //implicit type casting : float to double

        System.out.println("int value  : " + l);
        System.out.println("int after converting to long : " + m);
        System.out.println("int after converting to float : " + n);
        System.out.println("int after converting to double : " + o);


        System.out.println("-------------------------------------------------");

        long p = 1;
        float q = p; //implicit type casting : long to float
        double r = p; //implicit type casting : float to double

        System.out.println("long value  : " + p);
        System.out.println("long after converting to float : " + q);
        System.out.println("long after converting to double : " + r);


        System.out.println("-------------------------------------------------");


        float s = 1;
        double t = s; //implicit type casting : float to double

        System.out.println("float value  : " + s);
        System.out.println("float after converting to double : " + t);


        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        //Explicit type casting :

        double u = 1.23;
        float v = (float)u; //explicit type casting : double to float
        long w = (long)u; //explicit type casting : double to long
        int x = (int)u; //explicit type casting : double to int
        short y = (short)u; //explicit type casting : double to short
        byte z = (byte)u; //explicit type casting : double to byte

        System.out.println("double value  : " + u);
        System.out.println("double after converting to float : " + v);
        System.out.println("double after converting to long : " + w);
        System.out.println("double after converting to int : " + x);
        System.out.println("double after converting to short : " + y);
        System.out.println("double after converting to byte : " + z);

        System.out.println("-------------------------------------------------");

        float a1 = 1.23F;
        long a2 = (long)a1; //explicit type casting : float to long
        int a3 = (int)a1; //explicit type casting : float to int
        short a4 = (short)a1; //explicit type casting : float to short
        byte a5 = (byte)a1; //explicit type casting : float to byte

        System.out.println("float value  : " + a1);
        System.out.println("float after converting to long : " + a2);
        System.out.println("float after converting to int : " + a3);
        System.out.println("float after converting to short : " + a4);
        System.out.println("float after converting to byte : " + a5);

        System.out.println("-------------------------------------------------");

        long b1 = 1L;
        int b2 = (int)b1;
        short b3 = (short)b1;
        byte b4 = (byte)b1;

        System.out.println("long value  : " + b1);
        System.out.println("long after converting to int : " + b2);
        System.out.println("long after converting to short : " + b3);
        System.out.println("long after converting to byte : " + b4);

        System.out.println("-------------------------------------------------");

        int c1 = 1;
        short c2 = (short)c1;
        byte c3 = (byte)c1;

        System.out.println("int value  : " + c1);
        System.out.println("int after converting to short : " + c2);
        System.out.println("int after converting to byte : " + c3);

        System.out.println("-------------------------------------------------");

        short d1 = 1;
        byte d2 = (byte)d1;

        System.out.println("short value  : " + d1);
        System.out.println("short after converting to byte : " + d2);

        System.out.println("-------------------------------------------------");


    }
}
