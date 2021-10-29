package training;

public class ClericMain {
    public static void main(String[] args) {

        Cleric person = new Cleric();

        person.name = "mike";
        person.hp = 30;
        int sec = 0;

        System.out.println(person.hp);
        System.out.println(person.name);

        person.selfAid();
        System.out.println(person.hp);
        System.out.println(person.mp);

        person.pray(10);

        if(person.mp > 10) {
            person.mp = person.maxMp;
        }

        System.out.println(person.mp);
    }
}
