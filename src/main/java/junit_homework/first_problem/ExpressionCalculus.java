package junit_homework.first_problem;

public class ExpressionCalculus {
    public double expressionCalculus(double firstNumber, double secondNumber, String operator) {
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            default:
                System.out.println("The calculus cannot be made!");
                return result;
        }
        return result;
    }
}
