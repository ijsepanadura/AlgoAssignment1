public class Algo3 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[nums2.length-1-i] = nums[i];  // reversing array index
        }
        nums= nums2;
        System.out.print("nums array elements are : {");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +", ");  // print array values
        }
        System.out.println("\b\b} "); // remove end commma and add curly bracket close
    }
}
