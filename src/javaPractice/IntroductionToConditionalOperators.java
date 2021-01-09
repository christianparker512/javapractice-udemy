package javaPractice;

public class IntroductionToConditionalOperators {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public IntroductionToConditionalOperators
        (int count, int capacity, boolean open){
    if (count<1 || count >9){
        System.out.println("invalid reservation");
        }
    restaurantCapacity = capacity;
    isRestaurantOpen = open;
    guestCount = count;
    }
    public void confirmReservation(){
        if (restaurantCapacity >= guestCount && isRestaurantOpen){
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }
    public void informUser(){
        if(!isConfirmed){
            System.out.println("Unable to confirm reservation, please contact restaurant");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        IntroductionToConditionalOperators ReservationPartyOfThree = new IntroductionToConditionalOperators(3, 12, true);
        IntroductionToConditionalOperators ReservationPartyOfEight = new IntroductionToConditionalOperators(7,12,true);
        }
    }

