package javaPractice;

public class DogBreed {
    String breedType;
    public DogBreed (String breed){
        breedType = breed;
    }

    public static void main(String[] args) {
        DogBreed quincy = new DogBreed("terrier");
        System.out.println(quincy.breedType);
    }
}
