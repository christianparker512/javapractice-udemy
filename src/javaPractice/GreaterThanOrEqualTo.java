package javaPractice;

public class GreaterThanOrEqualTo {

        public static void main(String[] args){
            double recommendedWaterIntake = 8;
            double daysInChallenge = 30;
            double yourWaterIntake = 235.5;
            double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
            boolean isChallengeComplete = totalRecommendedAmount < recommendedWaterIntake;
            System.out.println(isChallengeComplete);
        }
    }


