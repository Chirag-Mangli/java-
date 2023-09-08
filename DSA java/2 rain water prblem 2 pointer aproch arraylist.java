import java.util.ArrayList;

class firstclass{
    public static int  water(ArrayList<Integer>l){
        int lp=0; 
        int rp= l.size()-1;
        int max=0;
        while(lp<rp){
            int  height= Math.min(l.get(lp), l.get(rp));
            int width= rp-lp;
            int area= height*width;
            max= Math.max(max, area);

            if (l.get(lp)<l.get(rp)){
                lp++;

            }
            else{
                rp--;
            }

        }return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer>l= new ArrayList<>();
        l.add(1);
        l.add(8);
        l.add(6);
        l.add(2);
        l.add(5);
        l.add(9);
        l.add(8);
        l.add(3);
        l.add(1);
        System.out.println(water(l));
    }
}