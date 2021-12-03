package training;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
