package OOP;

public class DishTest {
    public static void main (String[]args){
        Dish d = new Dish();
        d.wouldRecommend = true;
        d.nameOfDish = "Chicken Alfredo";
        d.costInCents = 1395;

        d.printSummary();
        DishTools.shoutDishName(d);
        DishTools.analyzeDishCost(d);
        DishTools.flipRecommendation(d);
    }
}