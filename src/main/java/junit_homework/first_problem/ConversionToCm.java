package junit_homework.first_problem;

public class ConversionToCm {
    public double conversionToCm(double value, String format) {
        double converted;
        switch (format) {
            case "mm":
                converted = value / 10;
                break;

            case "dm":
                converted = value * 10;
                break;

            case "m":
                converted = value * 100;
                break;

            case "km":
                converted = value * 100000;
                break;

            default:
                converted = value;
        }
        return converted;

    }
}
