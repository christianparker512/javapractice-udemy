package javaPractice;

public class Dog3 {
    String breed;
    boolean hasOwner;
    int age;

    public Dog3(String dogBreed, boolean dogOwned, int dogYears){
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main Method started");
        Dog3 Quincy = new Dog3("terrier", true, 11);
        Dog3 Baxter = new Dog3("terrier", true, 10);
        boolean isQuincyOlder = Quincy.age > Baxter.age;
        int totalDogYears = Quincy.age + Baxter.age;
        System.out.println("Two dogs created: a " + Quincy.breed + " and a " + Baxter.breed);
        System.out.println("The statement that Quincy is older is: " + isQuincyOlder);
        System.out.println("The total age of both dogs is " + totalDogYears + " years.");
    }

}
