class firstclass{
    public static int fab(int n ){
        if(n==0 ||n==1){
            return n;
        }
        int f1= fab(n-1);
        int f2= fab(n-2);
        int sum= f1+f2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fab(11));
        
    }
}