class Binarrysearch{

    public static void main(String[] args) {
        int[] arr3={-18,-17,-15,-8,-5,-2,-1,0,1,5,6,7,12,15,17,19,22,28,46,56,67,89,90};
        int[] arr2={90,87,76,54,43,32,21,19,16,15,12,10,6,3,1,0,-3,-5,-9-19,-40,-55,-69};
        int target=-55;
        int ans=binarySearch1(arr2,target);
        System.out.println(ans);
    }

    static int binarySearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] <= arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (arr[mid] > target) {
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if(arr[mid]<target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }

        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] <= arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if ((isAscending && arr[mid] < target) || (!isAscending && arr[mid] > target)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}