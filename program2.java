public class program2 {

    public static void main(String[] args) {

        int [] nums = {10,20,30,5,50};

        int search = 100;

        int result = linearsearch(nums, search);
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

    pub
}
