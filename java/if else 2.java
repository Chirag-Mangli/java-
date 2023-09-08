import java.util.Scanner;

class firstclass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        Scanner c = new Scanner(System.in);
        int b= c.nextInt();
        
        if (a== b){
            System.out.println("equal");
        }    
        if(a<b){
            System.out.println("b  is grater");
        }  
        else{
            System.out.println("a is grater");

        }  
              
    }
}