package object_containers_homework.punctul2;

import java.util.Comparator;

public class Check implements Comparator<Persons> {

    public int compare(Persons p1, Persons p2) {
        if (p1.getAge() == p2.getAge()) {
            return p1.getName().compareTo(p2.getName());
        } else {
            return p2.getAge() - p1.getAge();
        }
    }
}
