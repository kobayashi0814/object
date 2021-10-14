package basic.sample.enumsample;

public enum Gender {
    MEN("男"),//大文字の決まり
    WOMEN("女");

    //選択項目を和文にする場合

    //フィールド設定
    private String jpName;

    //コンストラクタ
    Gender (String jpName) {
        this.jpName = jpName;
    }

    //ゲッター
    public String getJpName() {
        return jpName;
    }
}
