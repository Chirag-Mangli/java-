class firstclass{
    public static void bsort(int a[]){
        for (int t=0; t<a.length-1;t++){
            for (int j=0; j<a.length-1-t;j++){
                if (a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
            }
        }

    }
    public static void aa(int a[]){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int a[]={4,3,2,5,6,1};
        bsort(a);
        aa(a);
        
        
    }
}