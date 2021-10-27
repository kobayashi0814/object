package training;

public class Omikuzi {
    public static void main(String[] args) {

        System.out.println("数あてゲーム");

        int ans = new java.util.Random().nextInt(9);

        for(int i =0; i < 6; i++) {

            System.out.println("0～9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();

            if(ans == num) {
                System.out.println("あたり");
                break;
            } else {
                System.out.println("はずれ");
            }
        }

        System.out.println("終了");

    }
}
