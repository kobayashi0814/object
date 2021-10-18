package ex.student2;

class Student {

    //フィールド
    private String name;//名前
    private String gender;//性別
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    //コンストラクタ
    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;

    }

    //ゲッター 今回は合計、平均以外は不要　処理する内容がないため
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public int sum() {
        return jap + math + eng;
    }

    public double ave() {
        return sum() / 3.0;
    }

    @Override
    public String toString() {
        return String.format("名前：%s 性別：%s 国語：%d 数学：%d 英語：%d 合計：%d 平均：%.2f",
                name,gender,jap,math,eng,sum(),ave());
    }
}





