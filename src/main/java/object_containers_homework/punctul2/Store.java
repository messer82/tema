package object_containers_homework.punctul2;

import java.util.TreeSet;

//You need to store Persoane in a TreeSet. Define 2 Comparators (one for name - nume and one for age-varsta) that will be used when creating the TreeSet;
//
//        Add Persoane to the TreeSet; iterate throug the treeset and print the name and the age;

public class Store {

    public static void main(String[] args) {
        TreeSet<Persons> personsTreeSet = new TreeSet<>(new Check());

        Persons person1 = new Persons("Ion", 25);
        Persons person2 = new Persons("Maria", 33);
        Persons person3 = new Persons("Gheorghe", 49);
        Persons person4 = new Persons("Alexandra", 17);

        personsTreeSet.add(person1);
        personsTreeSet.add(person2);
        personsTreeSet.add(person3);
        personsTreeSet.add(person4);
        personsTreeSet.add(new Persons("Patrocle", 22));

        for (Persons persons: personsTreeSet) {
            System.out.println(persons.getName() + " " + persons.getAge());
        }
    }
}
