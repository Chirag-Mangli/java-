class firstclass{
    public static void dec(int n ){
        int a= 0; 
        int pow= 0;
        while(n>0){
            int rem= n%2;
            a= a+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }System.out.println(a);
    }
    public static void main(String[] args) {
        dec(11);
        
    }
        
    
}