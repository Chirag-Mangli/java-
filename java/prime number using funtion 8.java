import javax.swing.text.Style;

/*class firstclass{
    public static boolean prime(int n){
        boolean x= true;
        for ( int div= 2; div <=n-1; div++){
            if (n%div==0){
                x= false;

            }
        
        }return x;
    }
    public static void main(String[] args) {
        System.out.println(prime(139));

        
    }*/
    class firstclass{
    public static boolean prime(int n){
        boolean x= true;
        for ( int div= 2; div <=Math.sqrt(n); div++){
            if (n%div==0){
                x= false;

            }
        
        }return x;
    }
    public static void main(String[] args) {
        System.out.println(prime(139));

        
    }
}    