package basic.human5;

//英語クラス
class English implements IfSayHello {

    private String name;

    public English(String name) {
        this.name = name;
    }

    @Override
    public void sayhello() {
        System.out.println("Hello.I'm " + name);
    }
}
