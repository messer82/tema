package object_containers_homework.punctul2;

public class Persons {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
