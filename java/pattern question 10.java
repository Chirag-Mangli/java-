class firstclass{
    public static void p(int n){
        for (int i= 1; i<=n;i++){
            for (int j= 1;j<=n-i; j++){
                System.out.print(" ");

            }
            for (int l=1;l<=n;l++){
                System.out.print("*");
            }System.out.println();
        }
    }
   public static void main(String[] args) {
        p(5);
    }
}