import java.util.Scanner;

class firstclass{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(r);
       /*  float area= 3.14*r*r;
        System.out.println(area);              they show error      3.14 is also float type*/
        float area= 3.14f*r*r;
        System.out.println(area); 

    }
}