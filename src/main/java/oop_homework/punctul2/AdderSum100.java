package oop_homework.punctul2;

public class AdderSum100 {

    public static int makeSum(int x) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input the number for which you want to calculate the sum: ");
//        int x = scanner.nextInt();

        int a = 0;

        for (int i = 1; i <= x; i++)
            a = a + i;

        System.out.println("The sum of the first " + x + " numbers is: " + a);
        return a;
    }
}