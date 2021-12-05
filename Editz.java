public class Editz {
    public class Dog {
        public void speak() {
            System.out.println("woof!");
        }

        public static void main(String[] args) {
            Dog d = new Dog();
            d.speak();

        }
    }

    public class Beagle {
        public void speak() {
            System.out.println("arf arf");

        }

    }

    public class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public boolean equals(Object other) {
            // ADD CODE HERE
        }

        public static void main(String[] args) {
            Dog d1 = new Dog("Rufus");
            Dog d2 = new Dog("Sally");
            Dog d3 = new Dog("Rufus");
            Dog d4 = d3;
            System.out.println(d1.equals(d2));
            System.out.println(d2.equals(d3));
            System.out.println(d1.equals(d3));
            System.out.println(d3.equals(d4));
        }
    }

}
