package basic.human3;

class Germany extends Human {
    public Germany(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hallo.Mein Name ist " + name);
    }
}

