import javax.swing.plaf.synth.SynthSliderUI;

class firstclass{
    public static void co(int a[]){
        int l=0;
        for(int i =0; i<a.length;i++){
            l=Math.max(l,a[i]);
        }
        int c[]=new int[l+1];
        for (int i=0; i<a.length; i++){
            c[a[i]]++;

        }
        int j =0;
        for (int i=0; i<a.length; i++){
            while(c[i]>0){
                a[j]=i;
                j++;
                c[i]--;
            }
        }
    }
    public static void print( int a[]){
        for ( int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={4,5,2,3,1,9,6,8,5};
        co(a);
        print(a);
    }
}