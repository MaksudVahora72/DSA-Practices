public class insertionsort {
    public static void main(String[] args) {
        int[] nums = {3, 6, 2, 1, 5};
        sorting(nums);
    }
    public static void sorting(int [] nums) {

        System.out.println("Before soring");
        for(int val : nums) {
            System.out.print(val + " ");
        }

        int key = 0, j = 0;
        for(int i=0;i<nums.length;i++) {
            key = nums[i];
            j = i-1;
            while (j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        System.out.println("\nAfter soring");
        for(int val : nums) {
            System.out.print(val + " ");
        }
    }
}
