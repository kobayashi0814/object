package training;

public class Vaind2 {

    public static void callEat(Animal animal) {
        System.out.println("Animal is eating");
    }

    public static void callEat(Dog dog) {
        System.out.println("Dog is eating");
    }

    public static void main(String args[])
    {
        Animal a = new Dog();
        Animal aa = new Animal();
        Dog d = new Dog();
        callEat(aa);
        callEat(d);
    }
}
