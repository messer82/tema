package final_quizz.punctul1;

import java.time.LocalDate;
import java.util.Objects;

public class Package {

    private String destination;
    private int distance;
    private int packageValue;
    private LocalDate deliveryDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return distance == aPackage.distance &&
                packageValue == aPackage.packageValue &&
                Objects.equals(destination, aPackage.destination) &&
                Objects.equals(deliveryDate, aPackage.deliveryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, distance, packageValue, deliveryDate);
    }

    @Override
    public String toString() {
        return "Package{" +
                "destination='" + destination + '\'' +
                ", distance=" + distance +
                ", packageValue=" + packageValue +
                ", deliveryDate=" + deliveryDate +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPackageValue() {
        return packageValue;
    }

    public void setPackageValue(int packageValue) {
        this.packageValue = packageValue;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Package(String destination, int distance, int packageValue, LocalDate deliveryDate) {
        this.destination = destination;
        this.distance = distance;
        this.packageValue = packageValue;
        this.deliveryDate = deliveryDate;
    }

    public Package() {

    }
}
