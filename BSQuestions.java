class BSQestions{
    public static void main(String[] args) {

        int[] nums={1,2,3,4,6,7,89,};
        int target=5;
//        System.out.println(ceiling(nums,target));
        System.out.println(floor(nums,target));
    }

    // find the smallest number that is greater or equal to target
    static int ceiling(int[] arr , int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid +1;
            }

        }
        return arr[start];
    }


    // find the greatest number that is smaller or equal to target
    static int floor(int[] arr , int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid +1;
            }

        }
        return arr[end];
    }

    

}