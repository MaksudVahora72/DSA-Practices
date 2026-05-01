public class program3 {
    public static void main(String[] args) {
        buublesort();
    }
    public static void buublesort() {
        int [] nums = {8,6,9,2,4,5};
        System.out.println("before sorting!");
        for(int data : nums) {
            System.out.print(data+" ");
        }
        System.out.println();
        System.out.println("After sorting!");
        for(int i=0;i < nums.length;i++) {
            for(int j=0; j<nums.length-i-1;j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int data : nums) {
            System.out.print(data+" ");
        }
    }
}
