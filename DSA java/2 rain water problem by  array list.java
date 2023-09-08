import java.util.ArrayList;

class firstclass{
    public static int water( ArrayList<Integer>l){
        int max=0;
        for (int i=0;i<l.size();i++){
            for (int j=i+1;j<l.size();j++){

                int height= Math.min(l.get(i),l.get(j) );
                int width= j-i;
                int area= height*width;
                max= Math.max(max, area);

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
        l.add(4);
        l.add(8);
        l.add(3);
        l.add(7);


        System.out.print(water(l));

    }
}