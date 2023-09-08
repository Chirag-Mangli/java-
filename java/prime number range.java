class firstclass{
     public static boolean prime(int n){
        boolean x= true;
        for ( int div= 2; div <=Math.sqrt(n); div++){
            if (n%div==0){
                x= false;

            }
        
        }return x;

    }
    public static void isprime(int n){
        for (int i =2; i<=n;i++){
        
            if (prime(i)){
                System.out.print(i+" ");
            }
        }System.out.println();
    }
    public static void main(String[] args) {
        //System.out.println(isprime(20));
        isprime(140);

        
    }
}