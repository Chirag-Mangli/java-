class firstclass{
   /*  public static  int sum( int a, int b){
        return a+b; 
    }
     public static int  sum( int a, int b, int c){
        return a+b+c; 
    }
    public static void main(String[] args) {
        int x= 2 ;
        int y= 5;
        int z= 7;
        int f1=sum(x,y);
        int f2= sum(x,y,z);
        System.out.println(f1);
        System.out.println(f2);
        
    }*/


    // anthor method short trick to call the function
    public static  int sum( int a, int b){
        return a+b; 
    }
    public static int  sum( int a, int b, int c){
        return a+b+c; 
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,5, 6));

    }

}