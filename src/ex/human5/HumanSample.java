package ex.human5;

import basic.human5.IfSayHello;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HumanSample {
    public static void main(String[] args) {
        //宣言と初期化
        List<IfSayHello> humans = new ArrayList<>();
        //初期化
        humans.addAll(Arrays.asList(new English("Tom"),
                                    new Japanese("高木"),
                                    new Chinese("林"),
                                    new Germany("オリバー")
        ));

        for (IfSayHello human:humans) {
            human.sayhello();
        }
    }
}

