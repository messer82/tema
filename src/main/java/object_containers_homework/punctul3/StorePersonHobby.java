package object_containers_homework.punctul3;

import java.util.*;

public class StorePersonHobby {

    public static void main(String[] args) {
        Person person1 = new Person("Gicu", 25);
        Person person2 = new Person("Ioana", 32);
        Person person3 = new Person("Atilla", 46);
        Person person4 = new Person("Cleopatra", 2050);

        AddressForHobby addressForSwimming = new AddressForHobby("Constanta", "Romania");
        AddressForHobby addressForSwimming1 = new AddressForHobby("Alexandria", "Egypt");
        AddressForHobby addressForSwimming2 = new AddressForHobby("Venice", "Italy");
        AddressForHobby addressForJogging = new AddressForHobby("Berlin", "Germany");
        AddressForHobby addressForJogging1 = new AddressForHobby("Paris", "France");
        AddressForHobby addressForJogging2 = new AddressForHobby("Moscow", "Russia");
        AddressForHobby addressForClimbing = new AddressForHobby("Chamonix", "France");
        AddressForHobby addressForClimbing1 = new AddressForHobby("Freiburg", "Germany");
        AddressForHobby addressForClimbing2 = new AddressForHobby("Brasov", "Romania");
        AddressForHobby addressForRiding = new AddressForHobby("Ulan Bator", "Mongolia");
        AddressForHobby addressForRiding1 = new AddressForHobby("Indianapolis", "USA");
        AddressForHobby addressForRiding2 = new AddressForHobby("Kiev", "Ukraine");

        List<AddressForHobby> addressForSwimmingList = new ArrayList<>();
        addressForSwimmingList.add(addressForSwimming);
        addressForSwimmingList.add(addressForSwimming1);
        addressForSwimmingList.add(addressForSwimming2);

        List<AddressForHobby> addressForJoggingList = new ArrayList<>();
        addressForJoggingList.add(addressForJogging);
        addressForJoggingList.add(addressForJogging1);
        addressForJoggingList.add(addressForJogging2);

        List<AddressForHobby> addressForClimbingList = new ArrayList<>();
        addressForClimbingList.add(addressForClimbing);
        addressForClimbingList.add(addressForClimbing1);
        addressForClimbingList.add(addressForClimbing2);

        List<AddressForHobby> addressForRidingList = new ArrayList<>();
        addressForRidingList.add(addressForRiding);
        addressForRidingList.add(addressForRiding1);
        addressForRidingList.add(addressForRiding2);

        Hobby swimming = new Hobby("swimming", 2, addressForSwimmingList);
        Hobby jogging = new Hobby("jogging", 3, addressForJoggingList);
        Hobby climbing = new Hobby("climbing", 1, addressForClimbingList);
        Hobby riding = new Hobby("riding", 2, addressForRidingList);



        List<Hobby> person1Hobbies = new ArrayList<>();
        person1Hobbies.add(swimming);
        person1Hobbies.add(climbing);

        List<Hobby> person2Hobbies = new ArrayList<>();
        person2Hobbies.add(swimming);
        person2Hobbies.add(jogging);
        person2Hobbies.add(climbing);

        List<Hobby> person3Hobbies = new ArrayList<>();
        person3Hobbies.add(climbing);
        person3Hobbies.add(riding);

        List<Hobby> person4Hobbies = new ArrayList<>();
        person4Hobbies.add(jogging);
        person4Hobbies.add(climbing);
        person4Hobbies.add(riding);

        HashMap<Person, List<Hobby>> personHobbyHashMap = new HashMap<>();
        personHobbyHashMap.put(person1, person1Hobbies);
        personHobbyHashMap.put(person2, person2Hobbies);
        personHobbyHashMap.put(person3, person3Hobbies);
        personHobbyHashMap.put(person4, person4Hobbies);

//        for (Person p : personHobbyHashMap.keySet()) {
//            for (Hobby hobby : personHobbyHashMap.get(p)) {
//                System.out.println(p.getName() + " " +
//                        hobby.getNameOfHobby() + " " +
//                        hobby.getAddressForHobbies().iterator().next().getCountry());
//            }
//        }

        for (Hobby hobby : personHobbyHashMap.get(person1)) {
            System.out.println(person1.getName() + " " +
                    hobby.getNameOfHobby() + " " +
                    hobby.getAddressForHobbies().iterator().next().getCountry());
        }
    }
}
