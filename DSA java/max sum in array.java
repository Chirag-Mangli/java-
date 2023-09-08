class firstclass{
    public  static void max(int a[]){
        int mi=0;
        int ma= 0;
        for (int i=0; i<a.length; i++){
            for (int j= i+1; j<a.length; j++){
               ma=0;
                for (int k= i; k<j; k++){  
                    ma+= a[k];      
                    System.out.println(ma);                 
                }System.out.println();
            }
            
        }
        if (mi<ma){
            mi= ma;
            System.out.println(ma);
        }
    }
    public static void main(String[] args) {
        int a[]= {2,3,4,5,8};
        max(a);
    }
}