package object_containers_homework.punctul3;

import java.util.Objects;

public class AddressForHobby {
    private String city, country;

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressForHobby that = (AddressForHobby) o;
        return Objects.equals(city, that.city) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country);
    }

    public AddressForHobby(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "AddressForHobby{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
