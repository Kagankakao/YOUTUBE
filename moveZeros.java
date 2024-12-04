public class soru1 {

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}