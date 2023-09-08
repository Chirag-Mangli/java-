class firstclass {
    public static void update(int a[]){
         for (int i= 0; i<a.length; i++){
            a[i]=a[i]+1;
            System.out.println(a[i]);
         }   

    }
    public static void main(String[] args) {
        int a[]={34,54,65};
       /* for (int i= 0; i<a.length; i++){
            a[i]=a[i]+1;
            System.out.println(a[i]);
        }*/
        update(a);
    }
}