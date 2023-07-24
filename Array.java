import java.util.Arrays;

class Array{
    public static void main(String[] args) {
        int[] nums={2,4,6,8,10};
        // System.out.println(max(nums));
        // int[] reversed = reverse(nums);
        // for (int i : reversed) {
        //     System.out.println(i);
        // }
        
        // pair(nums);

        subarray(nums);
    }

    static int max(int[] arr){

        int max=0;
        for (int i : arr) {
            if (i>max){
                max=i;
            }
            else{
                continue;
            }
            
        }
        return max;
    }


    static int[] reverse(int[] arr){
        int[] rev= new int[arr.length];
        int nums=0;
        for (int i = arr.length-1; i >=0; i--) {
            rev[nums]=arr[i];
            nums++;     
        }
        return rev;
        
    }

    static void pair(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }


    // here we find the max and min sum from the sums of the subarrays of given array
    static void subarray(int[] arr){
        int[] sumvalue= new int[15];
        int maxsum=0;
        int minsum=arr[0];
        int index=0;
        
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int temp=0;
                int[] nums=new int[j+1];
                for (int k = i; k <nums.length; k++) {
                    temp=temp+ arr[k];

                }
                sumvalue[index]=temp;
                index++;

                }
            System.out.println(Arrays.toString(sumvalue));
        }
        for (int maxval : sumvalue) {
            if(maxsum<maxval){
                maxsum=maxval;
            }

        }

        for (int maxvale : sumvalue) {
            if(minsum>maxvale){
                minsum=maxvale;
            }

        }

        System.out.println(maxsum);
        System.out.println(minsum);
    }

    
}