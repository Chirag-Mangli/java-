import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c= sc.nextInt();


        int a= 11;
        String b= (a<9)?"yes":"bo";
        System.out.println(b);

        String x= ((c%2)==0)?"even":"odd";
        System.out.println(x);

        int y = (a<20)?a:c;
        System.out.println(y);
    } 
}