package final_quizz.punctul1;

public class PackageGroupThread implements Runnable {

    PackageToGroup packageToGroup;

    public void run() {
        try {
            packageToGroup.makePackageGroup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public PackageGroupThread(PackageToGroup toGroup) {
        this.packageToGroup = toGroup;
    }
}
