class firstclass{
    public static void li(int a[], int key){
        for (int i =0; i<a.length; i++){
            if (a[i]== key){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        int a[]= {65,7,8,9,98,56};
        int key = 8;
        li(a,key);
        
    }
}