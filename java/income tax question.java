import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        float a;
        if (num<500000){
            System.out.println("no tax");

        }
        else if(num>500000 && num<1000000){
            a= (float)(num*0.2);
            System.out.println(a);
        }
        else{
            a=(float)(num*0.3);
            System.out.println(a);
        }
    }
}