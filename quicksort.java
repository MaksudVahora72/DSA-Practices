public class quicksort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 4, 2};
        int low = 0;
        int high = nums.length - 1;

        sorting(nums, low, high);

        System.out.print("Sorted data ");
        for (int val : nums) {
            System.out.print(val + " ");
        }
    }

    public static void sorting(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = partition(nums, low, high);

            sorting(nums, low, pivot-1);
            sorting(nums, pivot+1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i+1;
    }
}