package javaPractice;
public class WarmUp2 {
    public static void main(String[] args) {
    }
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(num == 9) count++;
        }
        return count;
    }
}