package basic.sample;

import java.util.Arrays;

class ArraysSample {
    static int sum(int... array) {
        int sum = 0;
        for(int value:array) sum += value;
        return sum;
    }
    public static void main(String[] args) {
        //配列のコピー
        int[] oldArray = {10,20,30};
        //新たに変数定義　元の配列から+3する　増やした列は初期値0
        int[] newArray = Arrays.copyOf(oldArray,oldArray.length + 3);

        //配列の文字列表現
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));

        //配列のソート
        int[] array = {100,30,5,2,8,40};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);//自然順にソート
        System.out.println(Arrays.toString(array));

        //値の探索
        int[] array1 = {2,4,7,1,8};
        Arrays.sort(array1);//事前にソートする
        //値8を探索
        System.out.println(Arrays.binarySearch(array1, 2));//2がある配列順が出てくる
        System.out.println(Arrays.binarySearch(array1, 3));//配列にない場合は負の数が帰ってくる

        //可変長引数
        System.out.println(sum(1, 2, 3, 4, 5));//15
        System.out.println(sum(10, 20));//30
    }

}
