class firstclass {
    public static int power(int x , int n){
        if (n==0){
            return 1;
        }
        int a = power(x,n-1);
        int b= x*a;
        return b;
    }
    //anthor method 



    public static int p(int x, int n){
        if (n==0){
            return 1;
        }
        int a=p(x, n/2)*p(x,n/2);

        if (n%2!=0){
            a=x*a;
       } return a;
    }
     public static void main(String[] args) {
        System.out.println(power(2, 4));
        System.out.println(p(2,10));
        
     }
}