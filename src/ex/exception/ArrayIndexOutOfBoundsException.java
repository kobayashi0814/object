package ex.exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("開始");
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(num[i]);
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
            e.printStackTrace(); //例外クラスの持つメソッド（エラーのログを表示する）
        } finally {
            System.out.println("終了");
        }
    }
}
