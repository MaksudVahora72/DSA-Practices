
public class mergesort {
    public static void main(String[] args) {
        int [] nums = {3,5,1,4,6,2};

        System.out.println("Before sorting");
        for(int val : nums)
            System.out.print(val);

        sorting(nums, 0, nums.length-1);

        System.out.println("\nAfter sorting");
        for(int val : nums)
            System.out.print(val);
    }
    public static void sorting(int [] nums, int l, int r){
        if(l<r) {
            int mid = (l+r)/2;

            sorting(nums, l, mid);
            sorting(nums, mid+1, r);
            merge(nums, l, mid, r);
        }
    }

    private static void merge(int[] nums, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int [] larr = new int[n1];
        int [] rarr = new int[n2];

        for(int x=0;x<n1;x++)
            larr[x] = nums[l + x];
        for(int x=0;x<n2;x++) {
            rarr[x] = nums[mid+1+x];
        }
        int i = 0;
        int j = 0;
        int k=l;

        while(i < n1 && j < n2){
            if(larr[i] <= rarr[j]) {
                nums[k] = larr[i];
                i++;
            }
            else {
                nums[k] = rarr[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            nums[k] = larr[i];
            i++;
            k++;
        }
        while(j < n2){
            nums[k] = rarr[j];
            j++;
            k++;
        }
    }
}
