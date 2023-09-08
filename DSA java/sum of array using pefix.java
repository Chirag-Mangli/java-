class firstclass{
    public static void sum(int a[]){
        int x=0;
        int y =0;
        for (int i=0; i<a.length; i++){
            x+=a[i];
            
         
           
           
        }System.out.println(x);

    }
    public static void main(String[] args) {
        int a[]= {3,4,5,6,-1,-5,1};

        sum(a);
    }
}