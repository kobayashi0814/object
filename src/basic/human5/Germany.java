package basic.human5;

//ドイツ人クラス
class Germany implements IfSayHello {

    private String name;

    public Germany(String name) {
        this.name = name;
    }

    @Override
    public void sayhello() {
        System.out.println("Hallo.Mein Name ist " + name);
    }
}

