class firstclass{
    public static int  product(int a , int b){
        int x= a*b;
        return x;
    }
    public static void main(String[] args) {
        int a= 6;
        int b= 4;
        int y=  product(a, b);
        System.out.println(y);
        System.out.println(product(2,3));
    }
}