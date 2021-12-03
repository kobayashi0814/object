package training;

import java.util.ArrayList;
import java.util.Arrays;

public class Training {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();

        p.addAll(Arrays.asList(
                new Person("小林", 66),
                new Person("高橋", 88)
        ));

        for(Person person : p) {
            System.out.println(person.toString());
            System.out.println(person.hashCode());
        }


    }

}
