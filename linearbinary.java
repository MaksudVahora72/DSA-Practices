public class linearbinary {

    public static void main(String[] args) {

        int [] nums = {10,20,30,5,50};

        int search = 30;

        //int result = linearsearch(nums, search);
        //int result = binarysearch(nums, search);
        int result = recursivefunction(nums, search, 0, nums.length-1);

        if(result==-1){
            System.out.println("Element does not exists");
        }
        else {
            System.out.println("Element exists at " + result);
        }
    }
    public static int linearsearch(int [] nums, int search) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==search) {
                return  i;
            }
        }
        return  -1;
    }

    public static int binarysearch(int [] nums, int search) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if(nums[mid] == search) {
                return mid;
            }else if(nums[mid] < search) {
                left = mid + 1;
            }
            else {
                right = mid + 1;
            }
        }
        return -1;
    }

    public static int recursivefunction(int [] nums, int search, int left, int right) {
        if(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == search) {
                return mid;
            }
            else if(nums[mid]<search) {
                return recursivefunction(nums, search, mid+1, right);
            }
            else
                return recursivefunction(nums, search, left, mid-1);
        }
        return - 1;
    }
}
