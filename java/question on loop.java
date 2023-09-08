import java.util.Scanner;

class firstclass {
    public static void main(String[] args) {
     System.out.println("enter the number");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a= 0;
     
     for (int i=1 ; i < n+1; i++){
        a=a+i;
        System.out.println(a);
    }
    
    for ( int j = 1 ; j<11; j++){
        System.out.println(n*j);

    }  

 
    
         
    }
 }