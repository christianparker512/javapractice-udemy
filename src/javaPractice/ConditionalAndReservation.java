package javaPractice;

public class ConditionalAndReservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public ConditionalAndReservation(int count, int capacity, boolean open){
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen= open;
    }
    public void confirmReservation(){
        if (restaurantCapacity >= guestCount && isConfirmed){
            System.out.println("Reservation is confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation can't be accepted at this time.");
            isConfirmed = false;
        }
    }
    public void informUser(){
            System.out.println("Please enjoy your meal");
        }

    public static void main(String[] args) {
        ConditionalAndReservation reservationFor3 = new ConditionalAndReservation(3,12,true);
        ConditionalAndReservation reservationFor8 = new ConditionalAndReservation(8, 12, true);
        reservationFor3.confirmReservation();
        reservationFor8.confirmReservation();
        reservationFor3.informUser();
        reservationFor8.informUser();
    }
}
