class firstclass{
    public static void in(int a[]){
        for (int i=0; i<a.length;i++){
            int cur=a[i];
            int prev= i-1;
            while(prev >=0  && a[prev]>cur){
                a[prev +1]= a[prev];
                prev--;
            }
            a[prev+1]=cur;
              
        }
    }
    public static void print(int a[]){
        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]= {4,2,3,1,5,2,8};
        in(a);
        print(a);
    }

}