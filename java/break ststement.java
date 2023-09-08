import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int a =sc.nextInt();
            if( (a%10)==0){
                break;
            }
                System.out.println(a);
             

        }while(true);

        
    }
}
