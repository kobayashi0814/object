package ex.inventory;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//在庫表示
public class ViewStock implements Constants{
    public static void main(String[] args) {

        List<PersonalComputer> pcList = new ArrayList<>();

            pcList.addAll(Arrays.asList(
                    new PersonalComputer("やまだ",1,1,128,Constants.BIT_64, Constants.WINDOWS_10),
                    new PersonalComputer("いけだ",2,1,128),
                    new PersonalComputer("いのうえ",3,1,500),
                    new PersonalComputer("たむら",4,2,128),
                    new PersonalComputer("わだ",5,2,500),
                    new PersonalComputer("くどう",6,2,256),
                    new PersonalComputer("さらど",7,3,256),
                    new PersonalComputer("あいざわ",8,3,500)
                    ));

     }
}

