import java.util.ArrayList;

class firstclass{
    public static void main(String[] args) {
        //how to creat array list
        ArrayList<Integer>list= new ArrayList<>();
        ArrayList<Float>list2= new ArrayList<>();        
        ArrayList<Boolean>list3= new ArrayList<>();

        //add function

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(8);
        System.out.print(list);
        list.add(0,7);
        System.out.println(list);

        // get function
        System.out.println(list.get(4));
         System.out.println(list.get(3));

         // remove function
        list.remove(2);
        System.out.println(list);


        // set value like [1,2,4,9,5,6] we use-----> set.list(index 2, newelment 9 )-----------------------> out put[1,2,4,9,5,6]
        list.set(3,9);
        System.out.println(list);


        // contain elment function    value like [1,2,4,9,5,6]  --->list.comtain(1)------> output true 
        // if list.contain(8)----------->output false
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.contains(8));
        System.out.println(list.contains(5));





    }
}