class firstclass{
    public static void sel(int a[]){
        for (int i=0; i<a.length-1; i++){
            int s=i;
            for(int j = i+1; j<a.length;j++){
                if (a[s]> a[j]){
                    s=j;
                }
            }
            int temp =a[s];
                a[s]=a[i];
                a[i]=temp;


        }
    }
    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={3,2,5,1,4};
        sel(a);
        print(a);
    }
}