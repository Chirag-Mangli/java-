class firstclass{
    public static int  sum(int n){
        if (n==1){
            return 1;
        }
        int a = sum(n-1);
        int b= n+sum(n-1);
        return b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
        
    }
}