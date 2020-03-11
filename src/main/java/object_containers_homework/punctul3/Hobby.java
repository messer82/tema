package object_containers_homework.punctul3;

import java.util.List;
import java.util.Objects;

public class Hobby {
    private String nameOfHobby;
    private int frequencyPerWeek;
    private List<AddressForHobby> addressForHobbies;

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public void setNameOfHobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public int getFrequencyPerWeek() {
        return frequencyPerWeek;
    }

    public void setFrequencyPerWeek(int frequencyPerWeek) {
        this.frequencyPerWeek = frequencyPerWeek;
    }

    public List<AddressForHobby> getAddressForHobbies() {
        return addressForHobbies;
    }

    public void setAddressForHobbies(List<AddressForHobby> addressForHobbies) {
        this.addressForHobbies = addressForHobbies;
    }

    public Hobby(String nameOfHobby, int frequencyPerWeek, List<AddressForHobby> addressForHobbies) {
        this.nameOfHobby = nameOfHobby;
        this.frequencyPerWeek = frequencyPerWeek;
        this.addressForHobbies = addressForHobbies;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameOfHobby='" + nameOfHobby + '\'' +
                ", frequency=" + frequencyPerWeek +
                ", addressForHobbies=" + addressForHobbies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return frequencyPerWeek == hobby.frequencyPerWeek &&
                Objects.equals(nameOfHobby, hobby.nameOfHobby) &&
                Objects.equals(addressForHobbies, hobby.addressForHobbies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfHobby, frequencyPerWeek, addressForHobbies);
    }
}
