package oop_homework_2.bubble_sort;

import java.util.Arrays;

//Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
// The sorting should be done based on the amount of revenue generated via sales.
// Each rep has a number of sales, and a quota / sale.
// After the sorting, the first object should be the rep with the most revenue generated.
// The last object in the array should be the rep with the least revenue generated.

public class SortingReps {

    public static void main(String[] args) {
        SortRepresentatives sortRepresentatives = new SortRepresentatives(new SortedSalesRepresentatives.SalesRepresentatives[]{
                new SortedSalesRepresentatives.SalesRepresentatives("Adi", 2, 15, 30),
                new SortedSalesRepresentatives.SalesRepresentatives("Petru", 3, 20, 60),
                new SortedSalesRepresentatives.SalesRepresentatives("Alina", 4, 10, 40),
                new SortedSalesRepresentatives.SalesRepresentatives("Ana", 3, 40, 120)
        });

        sortRepresentatives.sortDescTotalSold();
        System.out.println(Arrays.toString(sortRepresentatives.getSalesRepresentatives()));
    }
}
