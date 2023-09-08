class firstclass{
    public static void stock(int a[]){
        int by=0;
        int se=0;
        for (int i=0; i<a.length; i++){
            if (by<a[i]){
                int profit = a[i]-by;
                se= Math.max(profit, se);
                
            }
            else{
                by=a[i];
            }

        }System.out.println(se);
    }
    public static void main(String[] args) {
        int a[]={4,5,6,0,2,6,9,10 ,87,6,9};
        stock(a);
    }
}