package OOP_homework_II.bubble_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortRepresentatives {
    static private Comparator<SortedSalesRepresentatives.SalesRepresentatives> descTotalSold;

    static {
        descTotalSold = new Comparator<SortedSalesRepresentatives.SalesRepresentatives>() {
            @Override
            public int compare(SortedSalesRepresentatives.SalesRepresentatives o1, SortedSalesRepresentatives.SalesRepresentatives o2) {
                return Integer.compare(o1.getTotalSold(), o2.getTotalSold());
            }
        };
    }

    private SortedSalesRepresentatives.SalesRepresentatives[] salesRepresentatives;

    public SortedSalesRepresentatives.SalesRepresentatives[] getSalesRepresentatives() {
        return salesRepresentatives;
    }

    public void sortDescTotalSold() {
        Arrays.sort(salesRepresentatives, Collections.reverseOrder(descTotalSold));
    }

    public SortRepresentatives(SortedSalesRepresentatives.SalesRepresentatives[] salesRepresentatives) {
        this.salesRepresentatives = salesRepresentatives;
    }

}
