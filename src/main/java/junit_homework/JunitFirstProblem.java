package junit_homework;

public class JunitFirstProblem {

    public static void main(String[] args) {
        FirstNumber firstNumber = new FirstNumber(10, "cm");
        SecondNumber secondNumber = new SecondNumber(1, "m");
        ThirdNumber thirdNumber = new ThirdNumber(10, "mm");

        String finalUnitOfMeasurement = null;
        double expressionToBeCalculated = firstNumber.getDistanceValue() + secondNumber.getDistanceValue() - thirdNumber.getDistanceValue();

        if (!firstNumber.getUnitOfMeasurement().equals("mm") || !secondNumber.getUnitOfMeasurement().equals("mm") || !thirdNumber.getUnitOfMeasurement().equals("mm") && firstNumber.getUnitOfMeasurement().equals("cm") || secondNumber.getUnitOfMeasurement().equals("cm") || thirdNumber.getUnitOfMeasurement().equals("cm")) {
            expressionToBeCalculated = expressionToBeCalculated / 10;
            finalUnitOfMeasurement = "cm";

            if (!firstNumber.getUnitOfMeasurement().equals("cm") || !secondNumber.getUnitOfMeasurement().equals("cm") || !thirdNumber.getUnitOfMeasurement().equals("cm") && firstNumber.getUnitOfMeasurement().equals("dm") || secondNumber.getUnitOfMeasurement().equals("dm") || thirdNumber.getUnitOfMeasurement().equals("dm")) {
                expressionToBeCalculated = expressionToBeCalculated / 100;
                finalUnitOfMeasurement = "dm";

                if (!firstNumber.getUnitOfMeasurement().equals("dm") || !secondNumber.getUnitOfMeasurement().equals("dm") || !thirdNumber.getUnitOfMeasurement().equals("dm") && firstNumber.getUnitOfMeasurement().equals("m") || secondNumber.getUnitOfMeasurement().equals("m") || thirdNumber.getUnitOfMeasurement().equals("m")) {
                    expressionToBeCalculated = expressionToBeCalculated / 1000;
                    finalUnitOfMeasurement = "m";

                    if (!firstNumber.getUnitOfMeasurement().equals("m") || !secondNumber.getUnitOfMeasurement().equals("m") || !thirdNumber.getUnitOfMeasurement().equals("m") && firstNumber.getUnitOfMeasurement().equals("km") || secondNumber.getUnitOfMeasurement().equals("km") || thirdNumber.getUnitOfMeasurement().equals("km")) {
                        expressionToBeCalculated = expressionToBeCalculated / 1000000;
                        finalUnitOfMeasurement = "km";
                    }
                }
            }
        }

        System.out.println(expressionToBeCalculated + " " + finalUnitOfMeasurement);
    }
}
