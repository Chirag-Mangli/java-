class firstclass{
    public static void  pe(int n){
        for (int i= 1; i<=n; i++){
            //space 
            for (int j = 1; j<= n-i; j++){
                // * star
                System.out.print(" ");
                
            }
            for (int k =1; k<=i; k++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        
        pe(7);
    }
}
/*
  
      *
     **
    ***
   ****
  *****
 ******
*******

 */