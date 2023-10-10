import java.util.*;
import java.io.*; 
import java.util.ArrayList;

class practice{
    public static void main(String[] args) {

        // Scanner in= new Scanner(System.in);
        // System.out.print("enter a number : ");

        // int num= in.nextInt();
        // int i=0;
        // int last=0;
        // int reverse=0;

        // while(i<3){
        //     last=num%10;
        //     num=num/10;

        //     reverse=reverse*10 + last;
        //     i++;
        // }
        // System.out.println(reverse);

        ArrayList<Integer> numebers=selfdivisible(10, 20);
            System.out.println(numebers);
 

    }


    static ArrayList<Integer> selfdivisible(int lowenum , int uppernum){
        ArrayList<Integer> list= new ArrayList<Integer>();
        
        for (int i = lowenum; i <= uppernum; i++) {
            int indecator =0;
            int remaining=i;
            while (i>0) {
                int last = remaining%10;
                int reaminNum=remaining/10;
                remaining=reaminNum;
                if(last==0){
                    continue;
                }
                else if(i%last==0){
                    indecator=1;
                    break;
                }else{
                    indecator=0;
                    break;
                }
            }
            if (indecator==1){
                list.add(i);
            }else{
                continue;
            }
        
        }

        return list;
    }
}

//     static ArrayList<Integer> name(int lower, int upper){
//         ArrayList<Integer>= range;
//         for (int index = 0; index <=upper ; index++) {
//             if () {
                
//             } else {
                
//             }
//         }
//         return range;
//     }
// }