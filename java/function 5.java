//factorial progream useing function

import java.util.Scanner;

class firstclass{
    public static int fact( int n){
        int f=1;
        for (int i= 1; i<=n; i++){
            f= f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int x= fact(a);
        System.out.println(x);
    }
}
