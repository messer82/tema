package oop_homework_2.bubble_sort;

public class SortedSalesRepresentatives {

    static class SalesRepresentatives {
        private String salesPerson;
        private int numberOfSales, quota, totalSold;

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

        public int getTotalSold() {
            return totalSold;
        }

        public void setTotalSold(int totalSold) {
            this.totalSold = totalSold;
        }

        @Override
        public String toString() {
            return "SalesRepresentatives{" +
                    "salesPerson='" + salesPerson + '\'' +
                    ", numberOfSales=" + numberOfSales +
                    ", quota=" + quota +
                    ", totalSold=" + totalSold +
                    '}';
        }

        public SalesRepresentatives(String salesPerson, int numberOfSales, int quota, int totalSold) {
            this.salesPerson = salesPerson;
            this.numberOfSales = numberOfSales;
            this.quota = quota;
            this.totalSold = totalSold;
        }
    }

}
