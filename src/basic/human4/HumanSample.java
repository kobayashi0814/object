package basic.human4;

class HumanSample {
    public static void main(String[] args) {

        Human[] humans = {
                new English("Tom"),
                new Japanese("高木"),
                new Chinese("林"),
                new Germany("オリバー"),
        };

        for(Human human:humans) {
            human.sayHello();
        }
    }
}

