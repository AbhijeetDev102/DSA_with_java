import java.util.*;
class practice{
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.print("enter a number : ");

        int num= in.nextInt();
        int i=0;
        int last=0;
        int reverse=0;

        while(i<3){
            last=num%10;
            num=num/10;

            reverse=reverse*10 + last;
            i++;
        }
        System.out.println(reverse);


    }
}