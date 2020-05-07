package intro_to_java;

//Calculate the sum of the first 100 numbers higher than 0

public class Sum100 {
    public static void main(String[] args) {
        int a = 0;

        for (int i = 1; i <= 100; i++) {
            a = a + i;

        }

        System.out.println("The sum of the first 100 numbers higher than 0 is: " + a);
    }
}
