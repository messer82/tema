package junit_homework.first_problem;

class ConversionToMm {
    public double conversionToMm(double value, String format) {
        double converted;
        switch (format) {
            case "cm":
                converted = value * 10;
                break;

            case "dm":
                converted = value * 100;
                break;

            case "m":
                converted = value * 1000;
                break;

            case "km":
                converted = value * 1000000;
                break;

            default:
                converted = value;
        }
        return converted;

    }
}
