class firstclass{
    public static int sr(int n ){
        int i=0;
        while(n>0){
            int a= n%10;
            i= i+a;
            n=n/10;

        }return i;
    }
    public static void main(String[] args) {
      System.out.println(sr(193));
    }
}