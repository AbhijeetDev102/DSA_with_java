import java.util.*;
class linearsearch {
    public static void main(String[] args) {
        // For Method finding in array
        /*int[] arr ={1,2,45,6,7,8};
        int num=8;
        System.out.println(finding_in_array(arr,num));;
         */


        // for search in rang
        /*int[] arr ={1,2,45,6,7,8};
        int num=8;
        System.out.println(search_in_rang(arr, num, 1, 4));;
        */

        // for find in string method
        /*String str="hello world";
        char letter='l';
        System.out.println(find_in_string(str,letter));
        */

        //for finding minvalue in array
        /*int[] arr={10,-  6,23,7,9,7};
        System.out.println(min(arr));

         */

        //for search in 2d arraay
        /*int[][] array={
            {1,5,6,8,9,},
            {2,4,5,7,98},

                {2,45,6,6,77,4322}
        };
        int target=7;
        int[] ans= search_in_2D_array(array,target);
        System.out.println(Arrays.toString(ans));

         */


    }


    static int finding_in_array(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    static int search_in_rang(int[] arr, int num, int start, int end) {
        for (int i = start; i <end+1; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    static boolean find_in_string(String str, char letter) {
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==letter){
                return true;
            }
        }
        return false;
    }

    static int min(int[] arr){

        int minvalue=arr[0];
        for(int i:arr){
            if(i<minvalue){
                minvalue=i;
            }
        }
        return minvalue;
    }

    static int[] search_in_2D_array(int[][] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==target){
                    return new int[] {i, j};

                }

            }


        }
        return new int[] {-1,-1};
    }


}

