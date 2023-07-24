import java.util.*;
class Array_Questions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[6];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        arrayfrompermu(arr);

    }

    static void arrayfrompermu(int[] arr){
        int[] ans= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}