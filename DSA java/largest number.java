class firstclass{
    public static void lar(int a[]){
        int n= 0;  // this for - infenity

        for (int i =0; i<a.length;i++){
            if (n<a[i]){
              n= a[i];
            }
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        int a[]={7,6,78,9,0,3,212,347,45};
        lar(a);
    }
}