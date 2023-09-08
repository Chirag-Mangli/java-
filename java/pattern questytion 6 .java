class firstclass{
    public static void p( int n ){
        for (int i= 1; i<=n; i++){
            for (int j= 1;j<=n-i+1; j++){
                System.out.print(j);// print (i)
            }
            for (int k= 1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p(7);
    }
}