package javaPractice;

public class ConditionalOrReservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public ConditionalOrReservation(int count, int capacity, boolean open){
        if(count < 1|| count > 8){
            System.out.println("I'm sorry, we can't accommodate you.");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }
    public void confirmReservation(){
        if (restaurantCapacity >= restaurantCapacity && isRestaurantOpen){
            System.out.println("Your reservation is confirmed");
            isConfirmed = true;
        } else {
            isConfirmed = false;
            System.out.println("I'm sorry, we cannot accommodate you.");
        }
    }
    public void informUser(){
        System.out.println("Please enjoy your meal!");
    }

    public static void main(String[] args) {
        ConditionalOrReservation partyOf3 = new ConditionalOrReservation(3, 12, true);
        ConditionalOrReservation partyOf9 = new ConditionalOrReservation(9,12,true);
        partyOf3.informUser();
        partyOf9.informUser();
        partyOf3.confirmReservation();
        partyOf9.confirmReservation();
    }
}
