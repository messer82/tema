package junit_homework.first_problem;

public class ConversionToM {
    public double conversionToM(double value, String format) {
        double converted;
        switch (format) {
            case "mm":
                converted = value / 1000;
                break;

            case "dm":
                converted = value / 10;
                break;

            case "cm":
                converted = value / 100;
                break;

            case "km":
                converted = value * 1000;
                break;

            default:
                converted = value;
        }
        return converted;

    }
}
