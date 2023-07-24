import java.util.Scanner;


public class patterns{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        String num1= sc.nextLine();
    }

    static void diamondcorner( int n){
        for (int i = 0; i <2*n ; i++) {
            int colum= i>n ? 2*n -i: i;
            for (int j = 0; j<colum; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }

    static void diamond(int n){
        for (int row = 1; row <=2*n ; row++) {
            int colm= row>n ? 2*n - row: row;
            int space= row>n  ? row-n: n-row;
            for (int k = 1; k <=space ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= colm; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void hollowupperdiamond(int n){
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void hollowlowerdiamond(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n-i+1 ; k++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }

    static void upperdiamond(int n){
        int doub=1;
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=doub ; j++) {
                System.out.print("*");
            }
            doub=doub+2;
            System.out.println();
        }
    }  /* One way to do this my first approach*/

    static void anotherupperdiamond(int n){
        for (int i = 1; i <=n ; i++) {
            int spaces = n-i;
            for (int k = 1; k <=spaces ; k++) {
                System.out.print(" ");
            }
            int stars= 2*n - 2*spaces -1;
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } /*other way to so this logical way */

    static void fibonachitriangle(int n){
        int[] fibo= new int[n+1];
        int[] retn= new int[n+1];
        for (int i = 1; i <=n ; i++) {
            System.arraycopy(retn, 0, fibo, 0, n + 1);
            for (int k = 1; k <=n-i ; k++) {
                System.out.print(" ");

            }

            for (int j =0; j<i ; j++) {
                if (j==0 || j== i-1){
                    fibo[0]=1;
                    fibo[i-1]=1;
                    retn[0]=1;
                    retn[i-1]=1;
                    System.out.print(fibo[0] +" ");
                }
                else {
                    int sum=fibo[j]+fibo[j-1];
                    System.out.print(sum+ " ");
                    retn[j]=sum;
                }
            }
            System.out.println();


        }
    }
}

