class firstclass{
    public static void pr(int n){
        if (n==1){
            System.out.println(n);
           return;
        }
        System.out.println(n);
        pr(n-1);
    }

    public static void dp(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        pr(n-1);
        System.out.print(n+ "  ");
    }
    public static void main(String[] args) {
        int n= 10;
       // pr(n);
        dp(n);
    }
}