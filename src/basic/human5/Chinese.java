package basic.human5;

//中国人クラス
class Chinese implements IfSayHello {

    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void sayhello() {
        System.out.println("Nǐ hǎo. Wǒ jiào " + name);
    }
}
