package basic.student;

public class StudentSample {
    public static void main(String[] args) {
        //変数の宣言（インスタンスの作成）
        Student student1 = new Student("きむら", "男",1);
        Student student2 = new Student("こいけ","女", 3);
        Student student3 = new Student("もりかわ","男",2);

        //インスタンスの利用
        //値の取得
        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1);

        System.out.println(student2.getName());
        System.out.println(student2.getGender());
        System.out.println(student2.getGrade());
        System.out.println(student2);

        System.out.println(student3.getName());
        System.out.println(student3.getGender());
        System.out.println(student3.getGrade());
        System.out.println(student3);

        //値のセット
        student1.setName("マイケル");
        student1.setGender("女");
        student1.setGrade(3);
        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());
        System.out.println(student1);
    }
}
