class firstclass{
    public static void bubble(int a[]){
        for (int i=0; i<a.length-1;i++){
            for (int j=0; j<a.length-1-i;j++){
                if (a[j] > a[j+1]){
                    int temp= a[j];
                    a[j]= a[j+1];
                    a[j+1]=temp;
                }   
                
            }
        }
    }
    public static void arr(int a[]){
        for(int i= 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }System.out.println();
    } 

    public static void main(String[] args) {
        int a[]={6,7,2,3,4,1,7,9,3};
        bubble(a);
        arr(a);
    }
}