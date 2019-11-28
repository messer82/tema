package Intro_to_java;

public class ArraySquare {
    public static boolean isSquare(int[][] a) {
        a = new int[][] {{2,3,5} , {3,2}};
        int x = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != x)
                return false;
        }
        return true;
        }

    public static void main(String[] args) {
        int[][] a = {{2,3,5} , {3,2}};
        System.out.println("The array is square: " + isSquare(a));
    }
}
