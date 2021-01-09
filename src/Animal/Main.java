package Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal ("Animal", 1, 1,5, 5);

        Dog dog = new Dog ("Terrier", 8, 16,2,4, 1, 35,"Short Wirey");
        dog.eat();
        dog.walk();
        dog.run();
//        fish.swim();

    }


}
