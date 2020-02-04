package oop_homework.punctul2;

public class CalculusFactorialR {
    public static int factorialNumber(int n) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input the number to calculate factorial: ");
//        int n = scanner.nextInt();

        int a = 1;

        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println("The factorial of " + n + " is: " + a);
        return a;
    }
}