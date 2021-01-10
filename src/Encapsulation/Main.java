package Encapsulation;

//Making these private puts a shell around it and keeps things private. You can only access it with the getters.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Chris";
        player.health = 20;
        player.weapon = "gun";
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Christian", 50, "gun");
        System.out.println("The Enhanced Player's initial health is " + player1.getHealth());
    }
}
