package basic.human3;

//中国人クラス
class Chainese extends Human{
    public Chainese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Nǐ hǎo. Wǒ jiào " + name);
    }
}
