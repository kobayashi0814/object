package ex.bmi;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BmiSample {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();

        memberList.addAll(Arrays.asList(
                new Member("山田 太郎", Gender.MEN,25,1.77,68.3),
                new Member("山田 太郎", Gender.MEN,30,1.77,80.7),
                new Member("山田 太郎", Gender.MEN,44,1.91,88.3),
                new Member("山田 太郎", Gender.MEN,65,1.75,60.3)
        ));

    for (Member member:memberList) {
        System.out.println(member);
        }
    }
}
