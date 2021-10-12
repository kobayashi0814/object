package basic.human5;

class HumanSample {
    public static void main(String[] args) {
        IfSayHello[] humans = {
                new English("Tom"),
                new Japanese("高木"),
                new Chinese("林"),
                new Germany("オリバー"),
        };

        for (IfSayHello human:humans) {
            human.sayhello();
        }
    }
}

