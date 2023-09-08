class firstclass{
    public static int fact(int n){
        if (n==0){
          return 1;
        }
        //int a=fact(n-1);
        int b= n*fact(n-1);
        return b;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        
    }
}