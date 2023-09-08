class firstclass{
    public static void main(String[] args) {
        int a= 12344;
      /*  while(a > 0){
            int b= a%10;
            System.out.print(b);
            a= a/10;
       }  */  
 
       // anthor method

        int rev= 0 ;
        while (a> 0){
            int b= a%10;
            rev= (rev*10)+ b;

        }
        System.out.println(rev);
      
        

    }
}