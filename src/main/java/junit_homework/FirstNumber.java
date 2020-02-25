package junit_homework;

import java.util.Objects;

public class FirstNumber {
    private double distanceValue;
    private String unitOfMeasurement;

    public double getDistanceValue() {
        return distanceValue;
    }

    @Override
    public String toString() {
        return "FirstNumber{" +
                "distanceValue=" + distanceValue +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstNumber that = (FirstNumber) o;
        return Double.compare(that.distanceValue, distanceValue) == 0 &&
                Objects.equals(unitOfMeasurement, that.unitOfMeasurement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distanceValue, unitOfMeasurement);
    }

    public void setDistanceValue(double distanceValue) {
        this.distanceValue = distanceValue;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public FirstNumber(double distanceValue, String unitOfMeasurement) {
        this.distanceValue = distanceValue;
        this.unitOfMeasurement = unitOfMeasurement;

        if (unitOfMeasurement.equals("mm")) {
            distanceValue = distanceValue * 1;
        }
        if (unitOfMeasurement.equals("cm")) {
            distanceValue = distanceValue * 10;
        }
        if (unitOfMeasurement.equals("dm")) {
            distanceValue = distanceValue * 100;
        }
        if (unitOfMeasurement.equals("m")) {
            distanceValue = distanceValue * 1000;
        }
        if (unitOfMeasurement.equals("km")) {
            distanceValue = distanceValue * 1000000;
        }
    }
}
