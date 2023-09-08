class firstclass{
    public static void re(int a[]){
        int first= 0;
        int last= a.length-1;
        while(first<last){
            int temp=a[first];
            a[last]=a[first];
            a[first]=temp;

            first++;
            last--;
            
        }
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        re(a);
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }System.out.println();
    }
}