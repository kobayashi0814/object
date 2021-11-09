package training;

class Vaind {

    public static void main(String[] args) {
            Animal a= new Dog(); //here Type is Animal but object will be Dog
            a.eat();//Dog's eat called because eat() is overridden method

        }
    }

    class Animal {

        public void eat() {
            System.out.println("Inside eat method of Animal");
        }
    }

    class Dog extends Animal {


        public void eat() {
            System.out.println("Inside eat method of Dog");
        }
    }

