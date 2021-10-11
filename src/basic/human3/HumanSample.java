package basic.human3;

class HumanSample {
    public static void main(String[] args) {

        Human tom = new Human("Tom");
        tom.sayHello();
        Japanese hiroshi = new Japanese("ひろし");
        hiroshi.sayHello();
        Chainese lin = new Chainese("Lin");
        lin.sayHello();
        Germany Oliver = new Germany("Oliver");
        Oliver.sayHello();

        /**Human型の配列の場合

         Human[] humans = {

         new Human("Tom"),
         new Japanese("ひろし"),
         new Chinese("王"),
         new French("Andrée")
         };

         for (Human human:humans) {
         human.sayHello();
         }
         }
         /* *
         *
         */
    }
}

