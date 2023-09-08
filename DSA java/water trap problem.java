class firstclass{
    public static void wt(int a[]){
        int lf[]= new int[a.length];
        lf[0]=a[0];
        for (int i=0; i<a.length; i++){
            lf[i]= Math.max(a[i],lf[i-1]);
        }

        int rg[]= new int[a.length];
        rg[a.length-1]=a[a.length-1];
        for (int i=a.length-2; i>=0; i++){
            rg[i]=Math.max(a[i],rg[i+1]);
        }
        int x=0;
        for(int i=0; i<a.length; i++){
            int wtr= Math.min(lf[i],rg[i]);
            x+=wtr-a[i];
            System.out.println(x);

        }
    }

    public static void main(String[] args) {
        int a[]= {7,1,8,0,3,8};
        wt(a);
    }
}