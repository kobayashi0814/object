package ex.person2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class StreamPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(15);

        personList.addAll(Arrays.asList(
                new Person("やまだ",Birthplace.HOKKAIDO, Gender.MEN,35),
                new Person("いけだ",Birthplace.HOKKAIDO,Gender.WOMEN,26),
                new Person("いのうえ",Birthplace.FUKUOKA,Gender.MEN,32),
                new Person("たむら",Birthplace.FUKUOKA,Gender.WOMEN,22),
                new Person("わだ",Birthplace.TOKYO,Gender.MEN,42),
                new Person("くどう",Birthplace.TOKYO,Gender.WOMEN,55),
                new Person("さらど",Birthplace.OSAKA,Gender.MEN,31),
                new Person("あいざわ",Birthplace.OSAKA,Gender.WOMEN,44)
        ));


        //Streamの練習
        //35際以上の人の名前のみ表示
        System.out.println("練習1");
        personList.stream() //Stream生成
                .filter(p -> p.getAge() >= 35) //中間操作
                        .forEach(p -> System.out.println(p.getName()));

        //35歳未満の人の情報を表示
        System.out.println("練習2");
        personList.stream()
                .filter(p -> p.getAge() < 35)
                .forEach(System.out::println);

        //中身を表示
        System.out.println("中身を表示");
        personList.stream()
                .forEach(System.out::println);

        //名前のみ表示
        System.out.println("名前のみ表示");
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        //男性のみ表示
        System.out.println("男性のみ表示");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        //女性のみ表示
        System.out.println("女性のみ表示");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);

        //年齢を降順に表示
        System.out.println("年齢を降順に表示");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);

        //年齢を昇順に表示
        System.out.println("年齢を昇順に表示");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        //男性のみ名前の昇順に並べ替えて表示
        System.out.println("男性のみ名前の昇順に並べ替えて表示");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
