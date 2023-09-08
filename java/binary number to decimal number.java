class firstclass {
    public static void bin(int n){
        int a=0 ;
        int pow=0;
        while(n>0){
            int x= n%10;
            a= a+(x*(int)Math.pow(2, pow));
            pow++;
            n= n/10;

        }System.out.println(a);
        
    }
     public static void main(String[] args) {
     bin(101001);
        
     }
}