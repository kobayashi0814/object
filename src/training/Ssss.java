package training;

class Ssss {
    public static void main(String[] args) {

        int[] numbers = {3,4,9};

       for (int n : numbers) {
           System.out.println("1桁の数字を入力してください");
           int input = new java.util.Scanner(System.in).nextInt();

           if (input == n) {
               System.out.println("あたり");
               break;
           } else {
               System.out.println("はずれ");
           }
       }
    }

}
