import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={64,4,2,8,9,1,10};
        int[] arr1={3,2,1};
        cyclicS(arr1);
    }

    static void bubbleS(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped= false;
            for (int j = 1; j < arr.length-i;  j++) {
                
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
                
            }
            if(swapped==false){
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    static void selectionS(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int index=0;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[index]){
                    index=j;
                }
            }
            
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[index];
            arr[index]=temp;
            
        }
        System.out.println(Arrays.toString(arr));

    }
   

    static void insertionS(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicS(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current= arr[i];
            int temp=arr[arr[i]-1];
            arr[arr[i]-1]=current;
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
