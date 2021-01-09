package javaPractice;

public class ConditionalOperatorsReservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public ConditionalOperatorsReservation (int count, int capacity, boolean open){
        if (count < 1 || count > 8) {
            System.out.println("Sorry, we can't accommodate your reservation.");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }
    public void confirmReservation(){
        if (restaurantCapacity >= guestCount & isRestaurantOpen){
            System.out.println("reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }
    public void informUser() {
        if(!isConfirmed){
            System.out.println("Unable to confirm reservation, please contact the restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        ConditionalOperatorsReservation partyOfThree = new ConditionalOperatorsReservation(3,12,true);
        ConditionalOperatorsReservation partyOf7 = new ConditionalOperatorsReservation(7, 10, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOf7.confirmReservation();
        partyOf7.confirmReservation();
    }
}
