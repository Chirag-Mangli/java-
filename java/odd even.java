import java.util.Scanner;

class firstclass{
    public static void main (String args[]){
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in );
        int x = sc.nextInt();

        if (x %2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }

}