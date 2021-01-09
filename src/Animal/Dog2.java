package Animal;

public class Dog2 {
    String breed;
    boolean hasOwner;
    int age;

    public Dog2(String dogBreed, boolean dogOwned, int dogYears){
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main Method has Started");
        Dog2 Quincy = new Dog2("terrier", true, 10);

        Dog2 Baxter = new Dog2("terrier", true, 9);

    }
}
