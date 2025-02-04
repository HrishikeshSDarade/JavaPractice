package Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {

        // One-dimensional array declaration
        int[] a; // preferred way because it is easy to read that name 'a' is clearly separated from the type 'int'
        int b[]; // works but not preferred
        int []c; // works but not preferred

        //int[6] d; // invalid: size of the array must be specified in the declaration
        int[] e = new int[6];
        int[] a1, a2, a3; // declaring multiple arrays in a single line



        //two-dimensional array declaration

        int[][] f; // preferred way because it is easy to read that name 'f' is clearly separated from the type 'int'
        int g[][]; // works but not preferred
        int []h[]; // works but not preferred
        int[] i[]; // works but not preferred
        int[] []j; // works but not preferred
        int [][]k; // works but not preferred

        //int[3][3] l; // invalid: size of the array must be specified in the declaration

        int[][] m = new int[3][3];
        int[] n[], o[]; // declaring multiple arrays in a single line dimensions are n = 2 and o = 2
        int[] []p, q; // declaring multiple arrays in a single line dimensions are p = 2 and q = 2
        int[] []r, s[]; // declaring multiple arrays in a single line dimensions are r = 2 and s = 3
        //int[] []t, []u; // invalid



        //three-dimensional array declaration
        int[][][] u; // preferred way because it is easy to read that name 'u' is clearly separated from the type 'int'
        int v[][][]; // works but not preferred




    }
}
