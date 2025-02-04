package Arrays;

public class ArrayCreation {
    public static void main(String[] args) {

        System.out.println(args.length); // prints 0
        System.out.println(args.getClass().getName()); // prints [Ljava.lang.String;

        int[] a = new int[5]; // array of 5 elements
        String[] b = new String[5]; // array of 5 elements
        char[] c = new char[5]; // array of 5 elements
        boolean[] d = new boolean[5]; // array of 5 elements
        double[] e = new double[5]; // array of 5 elements
        float[] f = new float[5]; // array of 5 elements
        long[] g = new long[5]; // array of 5 elements
        short[] h = new short[5]; // array of 5 elements
        byte[] i = new byte[5]; // array of 5 elements

        int[][] j = new int[5][5]; // two-dimensional array of 5x5
        int[][][] k = new int[5][5][5]; // three-dimensional array of 5x5x5


        System.out.println(a.getClass().getName()); // prints [I
        System.out.println(b.getClass().getName()); // prints [Ljava.lang.String;
        System.out.println(c.getClass().getName()); // prints [C
        System.out.println(d.getClass().getName()); // prints [Z
        System.out.println(e.getClass().getName()); // prints [D
        System.out.println(f.getClass().getName()); // prints [F
        System.out.println(g.getClass().getName()); // prints [J
        System.out.println(h.getClass().getName()); // prints [S
        System.out.println(i.getClass().getName()); // prints [B
        System.out.println(j.getClass().getName()); // prints [[I
        System.out.println(k.getClass().getName()); // prints [[[I

        System.out.println("-------------------------------------------------");

        //LoopHoles
        int[] l = new int[0]; // array of 0 elements
        // int[] m = new int[-5]; // array of -5 elements // throws NegativeArraySizeException // get the runtime exception // compiles successfully
        int[] n = new int['A']; // array of 65 elements // ASCII value of 'A' is 65
        int[] o = new int[5 + 5]; // array of 10 elements // expression evaluates to 10
        int[] p = new int[5 * 5]; // array of 25 elements    // expression evaluates to 25
        int[] q = new int[5 / 5]; // array of 1 element      // expression evaluates to 1
        int[] r = new int[5 % 5]; // array of 0 elements     // expression evaluates to 0
        int[] s = new int[5 << 2]; // array of 20 elements
        int[] t = new int[5 >> 2]; // array of 1 element
        int[] u = new int[5 >>> 2]; // array of 1 element
        int[] v = new int[5 & 2]; // array of 0 elements
        int[] w = new int[5 | 2]; // array of 7 elements

        System.out.println(l.length); // prints 0
       // System.out.println(m.length); // throws NegativeArraySizeException
        System.out.println(n.length); // prints 65
        System.out.println(o.length); // prints 10
        System.out.println(p.length); // prints 25
        System.out.println(q.length); // prints 1
        System.out.println(r.length); // prints 0
        System.out.println(s.length); // prints 20
        System.out.println(t.length); // prints 1
        System.out.println(u.length); // prints 1
        System.out.println(v.length); // prints 0
        System.out.println(w.length); // prints 7

        System.out.println("-------------------------------------------------");

        //Array of arrays

        int[][] x = new int[3][]; // array of 3 elements
        x[0] = new int[3]; // array of 3 elements
        x[1] = new int[5]; // array of 5 elements
        x[2] = new int[2]; // array of 2 elements

        //how can i add the elements to the array of arrays?
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;

        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;
        x[1][3] = 7;
        x[1][4] = 8;

        x[2][0] = 9;
        x[2][1] = 10;

        //how can i print whole array of arrays?
        for(int j1 = 0; j1< x.length; j1++){
            for(int j2 =0; j2<x[j1].length; j2++){
                System.out.println(x[j1][j2]+ " ");
            }
        }


        int[] arr = new int[3];
        System.out.println(arr); // prints [I@1b6d3586 //internally toString method will be called as classname@hashcode
        System.out.println(arr[0]); // prints 0 //default value of int


        int[][] arr1 = new int[2][3];
        System.out.println(arr1); // prints [[I@4554617c //internally toString method will be called as classname@hashcode
        System.out.println(arr1[0]); // prints [I@74a14482 //internally toString method will be called as classname@hashcode
        System.out.println(arr1[0][0]); // prints 0 //default value of int



    }
}
