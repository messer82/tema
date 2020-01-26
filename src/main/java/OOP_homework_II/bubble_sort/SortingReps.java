package OOP_homework_II.bubble_sort;

import java.util.Arrays;

//Stiu ca denumirile sunt prost facute, dar din pacate nu m-am gandit in avans la asta...

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
