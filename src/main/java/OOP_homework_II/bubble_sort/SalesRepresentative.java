package OOP_homework_II.bubble_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class SalesRepresentative<totalSold> {
    private String salesPerson;
    private int numberOfSales;
    private int quota;

    public int getTotalSold() {
        return totalSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesRepresentative<?> that = (SalesRepresentative<?>) o;
        return numberOfSales == that.numberOfSales &&
                quota == that.quota &&
                totalSold == that.totalSold &&
                Objects.equals(salesPerson, that.salesPerson) &&
                Objects.equals(salesRepresentative1, that.salesRepresentative1) &&
                Objects.equals(salesRepresentative2, that.salesRepresentative2) &&
                Objects.equals(salesRepresentative3, that.salesRepresentative3) &&
                Objects.equals(salesRepresentative4, that.salesRepresentative4) &&
                Arrays.equals(salesReps, that.salesReps);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(salesPerson, numberOfSales, quota, totalSold, salesRepresentative1, salesRepresentative2, salesRepresentative3, salesRepresentative4);
        result = 31 * result + Arrays.hashCode(salesReps);
        return result;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    private int totalSold;

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }


    SalesRepresentative(String salesPerson, int numberOfSales, int quota, int totalSold) {
        this.salesPerson = salesPerson;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.totalSold = totalSold;
    }

    SalesRepresentative salesRepresentative1 = new SalesRepresentative("Adi", 2, 15, 30);
    SalesRepresentative salesRepresentative2 = new SalesRepresentative("Petru", 3, 20, 60);
    SalesRepresentative salesRepresentative3 = new SalesRepresentative("Alina", 4, 10, 40);
    SalesRepresentative salesRepresentative4 = new SalesRepresentative("Ana", 3, 40, 120);

    SalesRepresentative[] salesReps = {salesRepresentative1, salesRepresentative2, salesRepresentative3, salesRepresentative4};

    public SalesRepresentative getSalesRepresentative1() {
        return salesRepresentative1;
    }

    public void setSalesRepresentative1(SalesRepresentative salesRepresentative1) {
        this.salesRepresentative1 = salesRepresentative1;
    }

    public SalesRepresentative getSalesRepresentative2() {
        return salesRepresentative2;
    }

    public void setSalesRepresentative2(SalesRepresentative salesRepresentative2) {
        this.salesRepresentative2 = salesRepresentative2;
    }

    public SalesRepresentative getSalesRepresentative3() {
        return salesRepresentative3;
    }

    public void setSalesRepresentative3(SalesRepresentative salesRepresentative3) {
        this.salesRepresentative3 = salesRepresentative3;
    }

    public SalesRepresentative getSalesRepresentative4() {
        return salesRepresentative4;
    }

    public void setSalesRepresentative4(SalesRepresentative salesRepresentative4) {
        this.salesRepresentative4 = salesRepresentative4;
    }

    public SalesRepresentative[] getSalesReps() {
        return salesReps;
    }

    public void setSalesReps(SalesRepresentative[] salesReps) {
        this.salesReps = salesReps;
    }

    public void sortReps(SalesRepresentative[] salesReps, Comparator<totalSold> sortedReps) {
        Arrays.sort(salesReps, Collections.reverseOrder());
        System.out.println(sortedReps.toString());
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "salesPerson='" + salesPerson + '\'' +
                ", numberOfSales=" + numberOfSales +
                ", quota=" + quota +
                ", totalSold=" + totalSold +
                ", salesRepresentative1=" + salesRepresentative1 +
                ", salesRepresentative2=" + salesRepresentative2 +
                ", salesRepresentative3=" + salesRepresentative3 +
                ", salesRepresentative4=" + salesRepresentative4 +
                ", salesReps=" + Arrays.toString(salesReps) +
                '}';
    }

    public SalesRepresentative(String salesPerson, int numberOfSales, int quota, int totalSold, SalesRepresentative salesRepresentative1, SalesRepresentative salesRepresentative2, SalesRepresentative salesRepresentative3, SalesRepresentative salesRepresentative4, SalesRepresentative[] salesReps) {
        this.salesPerson = salesPerson;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.totalSold = totalSold;
        this.salesRepresentative1 = salesRepresentative1;
        this.salesRepresentative2 = salesRepresentative2;
        this.salesRepresentative3 = salesRepresentative3;
        this.salesRepresentative4 = salesRepresentative4;
        this.salesReps = salesReps;
    }
}
