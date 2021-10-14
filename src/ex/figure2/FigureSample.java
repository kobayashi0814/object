package ex.figure2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FigureSample {
    public static void main(String[] args) {
        //宣言と初期化
        List<Figure> figures = new ArrayList<>();//＜＞内はデータ型、配列名、スーパークラス名を設定
        //初期化
        figures.addAll(Arrays.asList(new Rectangle(10, 20),
                                     new Triangle(50, 100),
                                     new Circle(20)
        ));

        for (Figure figure: figures) {
            System.out.println(figure);
        }
    }
}
