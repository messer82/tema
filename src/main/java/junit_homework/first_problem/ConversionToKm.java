package junit_homework.first_problem;

public class ConversionToKm {
    public double conversionToKm(double value, String format) {
        double converted;
        switch (format) {
            case "mm":
                converted = value / 1000000;
                break;

            case "m":
                converted = value / 1000;
                break;

            case "cm":
                converted = value / 100000;
                break;

            case "dm":
                converted = value / 10000;
                break;

            default:
                converted = value;
        }
        return converted;

    }
}
