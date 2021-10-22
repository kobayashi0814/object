package ex.person;

import basic.sample.enumsample.Gender;

class Person implements Comparable<Person> {

    private String name;
    private Gender gender;
    private int age;

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return String.format("%s %s %d",
                name,gender,age);
    }

    @Override
    public int compareTo(Person o) {
        return getAge() - o.getAge();//sum()が自身の合計点、o.sum()が比較対象の合計点
    }
}
