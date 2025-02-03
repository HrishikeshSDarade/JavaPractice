package com.example;

public class Literals {
    public static void main(String[] args) {
        int x = 10;      // decimal
        int y = 0b1010;  // binary
        int z = 012;     // octal
        int w = 0xA;     // hexadecimal
        int a = 0X10;    // hexadecimal
        int b = 0XFace;  // hexadecimal
        //int c = 0xBoss;  // invalid: Boss is not a valid digit in hexadecimal because it is not a digit from 0 to 9 or A to F

        int c = 0b1010_1011_1100_1101_1110;  // binary literal with underscores

        System.out.println(x);  // 10
        System.out.println(y);  // 10
        System.out.println(z);  // 10
        System.out.println(w);  // 10
        System.out.println(a);  // 16
        System.out.println(b);  // 64206
        System.out.println(c);  // 43981

    }
}

/*
the above will compile the literals are the values assigned to the variables in different number systems
decimal, binary, octal, hexadecimal

Decimal: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
Binary: 0, 1
Octal: 0, 1, 2, 3, 4, 5, 6, 7
Hexadecimal: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F

The basic way to represent a number in Java is decimal, which is base 10.

To specify a number in binary, prefix it with 0b or 0B.

To specify a number in octal, prefix it with 0.

To specify a number in hexadecimal, prefix it with 0x or 0X.

Underscores can be used in numeric literals to improve readability. They are ignored by the compiler.


Can you provide internal working of each number system in Java?
Decimal: Decimal is the base 10 number system. It uses 10 digits from 0 to 9.
         The rightmost digit has a weight of 10^0, the next digit has a weight of 10^1, and so on.
         For example, the decimal number 123 can be represented as 1*10^2 + 2*10^1 + 3*10^0.

Binary: Binary is the base 2 number system. It uses 2 digits 0 and 1.
        The rightmost digit has a weight of 2^0, the next digit has a weight of 2^1, and so on.
        For example, the binary number 101 can be represented as 1*2^2 + 0*2^1 + 1*2^0.

Octal: Octal is the base 8 number system. It uses 8 digits from 0 to 7.
       The rightmost digit has a weight of 8^0, the next digit has a weight of 8^1, and so on.
       For example, the octal number 123 can be represented as 1*8^2 + 2*8^1 + 3*8^0.

Hexadecimal: Hexadecimal is the base 16 number system. It uses 16 digits from 0 to 9 and A to F.
             The rightmost digit has a weight of 16^0, the next digit has a weight of 16^1, and so on.
             For example, the hexadecimal number 1A3 can be represented as 1*16^2 + A*16^1 + 3*16^0,
             where A is equivalent to 10 in decimal.

Underscores in numeric literals: Underscores can be used in numeric literals to improve readability.
                                They are ignored by the compiler and can be placed anywhere in the number.
                                For example, 1_000_000 is equivalent to 1000000.
 */