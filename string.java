import java.util.*;
class string{


    static void miniMaxSum(ArrayList<Integer> arr ){
        int minnum=0;
        int maxnum=0;
        ArrayList<Integer> max= new ArrayList<Integer>();

        Collections.sort(arr);
        for (int i=0 ; i<arr.size() -1;  i++){
            minnum = minnum + arr.get(i);
        }
        Collections.reverse(arr);

        for (int j=0; j<arr.size() -1; j++){
            maxnum = maxnum + arr.get(j);
        }
        System.out.print(minnum);
        System.out.print(" ");
        System.out.print(maxnum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array by separating them by space: ");

        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String element : elements) {
            int value = Integer.parseInt(element);
            arrayList.add(value);
        }

        miniMaxSum(arrayList);

    }





}