public class Algo2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        int numSmall=0;
        int numLarge=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]< numSmall){  // comapare small value 
                numSmall = nums[i]; // store smallest value
            }
            if(nums[i]> numLarge){  // comapare large value
                numLarge = nums[i]; // store largest value
            }
        }
        System.out.println("Smallest value in the list : " + numSmall);
        System.out.println("Largest value in the list : "+ numLarge);
    }
}
