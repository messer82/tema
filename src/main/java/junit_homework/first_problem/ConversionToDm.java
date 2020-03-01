package junit_homework.first_problem;

public class ConversionToDm {
    public double conversionToDm(double value, String format) {
        double converted;
        switch (format) {
            case "mm":
                converted = value / 100;
                break;

            case "m":
                converted = value * 10;
                break;

            case "cm":
                converted = value / 10;
                break;

            case "km":
                converted = value * 10000;
                break;

            default:
                converted = value;
        }
        return converted;

    }
}
