class firstclass{
    public static int nf(int x){
        int a=1;
        for (int i=1; i<=x; i++){
            a*=i;

        }return a;

    }
    public static int bio(int n , int r){
        int a= nf(n);
        int b= nf(r);
        int s= nf(n-r);
        int sum= a/(b*s);
        return sum;

    }
    
    public static void main(String[] args) {
       System.out.println(bio(5,2));
        
        
    }
}