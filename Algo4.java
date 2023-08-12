public class Algo4 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int num1;
        for (int i = 0; i < nums.length/2; i++) { // run for loop half length of array
            num1= nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[i];   // interchange end and start values
            nums[i]=num1;
        }
        System.out.print("nums array elements are : {");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +", ");  // print array values
        }
        System.out.println("\b\b} "); // remove end commma and add curly bracket close
    }
}
