class firstclass{
    public static void ka(int a[]){
        int cur =0;
        int ma= Integer.MIN_VALUE;
        for (int i=0; i<a.length; i++){
            cur+=a[i];
            if (cur<0){
                cur=0;
                
            } ma= Math.max(cur , ma);
            
    }System.out.println("djs"+ " "+ ma);
}
    public static void main(String[] args) {
        int a[]= {7,-4,-3,9,-67,6};
        ka(a);

        
    }

}
