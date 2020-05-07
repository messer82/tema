package final_quizz.punctul1;

import java.util.*;
import java.util.stream.Collectors;

public class PackageToGroup {

    private List<Package> packageList;

    public List<Package> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<Package> packageList) {
        this.packageList = packageList;
    }

    public PackageToGroup(List<Package> packageList) {
        this.packageList = packageList;
    }

    public synchronized void makePackageGroup() throws InterruptedException {
        int totalValue = 0;
        int totalRevenue = 0;
        Package[] arr = packageList.toArray(new Package[0]);
        while (packageList.iterator().hasNext()) {

            List<Package> packageList1 = packageList.
                    stream().
                    collect(Collectors.collectingAndThen
                            (Collectors.toCollection(() -> new TreeSet<>
                                    (Comparator.comparing(Package::getDeliveryDate).thenComparing(Package::getDestination))),
                                    ArrayList::new));

            for (Package p : packageList1) {

                for (Package aPackage : arr) {
                    if (aPackage.getDeliveryDate().equals(p.getDeliveryDate()) && aPackage.getDestination().equals(p.getDestination())) {
                        totalValue = totalValue + aPackage.getPackageValue();
                        totalRevenue = totalRevenue + aPackage.getDistance();
                    }
                }

                System.out.println("Delivering for <" + p.getDestination() + "> and date <" + p.getDeliveryDate() + "> in <" + p.getDistance() + "> seconds");
                System.out.println("Total value of transported packages is: " + totalValue);
                System.out.println("Total revenue from transporting the packages is: " + totalRevenue);

                totalValue = 0;
                totalRevenue = 0;
                    Thread.sleep(packageList1.iterator().next().getDistance() * 1000);
            }
        }
    }
}
