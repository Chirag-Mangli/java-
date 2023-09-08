import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class firstclass{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        /*boolean x= true;

         if (n==2){
            System.out.println("is prime");
        }
        for ( int div= 2; div<= n-1; div++){
            if (n%div==0){
                x= false;
               
            }         

        }if (x== true){
            System.out.println("is  prime ");
        }
        else{
            System.out.println("is not prime");

            
        }*/

             // in this the loop runs   2 to  n-1 the complexity is so high    -----> we cheek 2 to under root n  like 4 under root --> 2 
             // Math.sqrt(n) they under root of n
        boolean x= true;

         if (n==2){
            System.out.println("is prime");
        }
        for ( int div= 2; div<= Math.sqrt(n); div++){
            if (n%div==0){
                x= false;
               
            }         

        }if (x== true){
            System.out.println("is  prime ");
        }
        else{
            System.out.println("is not prime");

            
        }


        
    }
}