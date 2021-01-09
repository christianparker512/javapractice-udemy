package Animal;

public class Bird extends Animal{
    private int feathers;
    private int wings;
    private int beak;

    public Bird(String name, int brain, int body, int size, int weight, int fly, int molt) {
        super(name, brain, body, size, weight);
        this.feathers = feathers;
        this.beak = beak;
        this.wings=wings;
    }
    private void flapWings() {

    }
    private void fly (int speed){
        super.move(speed);
    }

}
