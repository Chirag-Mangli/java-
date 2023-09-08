class firstclass{
    public static void sa(int a[]){
        for (int i= 0; i<a.length; i++){
            for (int j=i+1; j<a.length;j++){
                for (int k=i;k<j;k++){
                    System.out.print(a[k]);
                }System.out.println();
            }System.out.println();

        }
    }
    public static void main(String[] args) {
        int a[]={2,3,4,6,7};
        sa(a);
    }
}