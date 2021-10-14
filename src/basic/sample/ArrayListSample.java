package basic.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

    //ArrayListのサンプル
    class ArrayListSample {
        public static void main(String[] args) {
            //宣言と初期化
            List<Integer> list = new ArrayList<>();

            //初期化
            list.addAll(Arrays.asList(20,10,40,30,50));

            //表示
            System.out.println(list);

            //要素の追加
            list.add(60);
            System.out.println(list);
            list.add(2,70);
            System.out.println(list);

            //要素の上書き
            list.set(0,80);
            System.out.println(list);

            //要素の削除
            list.remove(2);//2番目を削除
            System.out.println(list);

            list.removeAll(Arrays.asList(30,60)); //30か60があればリストから削除
            System.out.println(list);

            list.retainAll(Arrays.asList(10,40,50,80)); //10と40と50と80を残して削除
            System.out.println(list);

            //インデックスを指定して要素を取得
            System.out.println(list.get(3));

            //サイズ
            System.out.println(list.size());

            //一部の要素の取得
            System.out.println(list.subList(1,3));

            //要素の消去
            list.clear();
            System.out.println(list);

            System.out.println(list.isEmpty());//true

            //初期化
            list.addAll(Arrays.asList(4,7,2,1,5,9,8,3,4));
            System.out.println(list);

            //値の検索
            System.out.println(list.contains(5));//値が存在するか true
            System.out.println(list.contains(6));//false
            System.out.println(list.containsAll(Arrays.asList(1, 2, 3)));//すべての値が存在してるか

            int num = 4;
            //インデックスに4があるか確認
            if (list.contains(num)) {
                System.out.println(list.indexOf(num));//最初に見つけたインデックス
                System.out.println(list.lastIndexOf(num));//最後に見つけたインデックス
            }

            //ソート
            list.sort(Comparator.naturalOrder());// 降順に並べる
            System.out.println(list);
            list.sort(Comparator.reverseOrder());//昇順に並べる
            System.out.println(list);
        }
    }
