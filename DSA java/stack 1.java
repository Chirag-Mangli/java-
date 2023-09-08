import java.util.ArrayList;
import java.util.Stack;

class firstclass{
    public class StackB{
        static class Stack{
            static ArrayList<Integer>a= new ArrayList<>();
            // empty
            public static boolean isEmpty(){
                return a.size()==0;
            }
            // push

            public static void push(int data){
                a.add(data);

            }
            //pop

            public static int pop(){
                int top= a.get( a.size()-1);
                a.remove(a.size()-1);
                return top;

            }
            //peek
            public static int peek(){
                return a.get(a.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Stack<E> s= new Stack();
        s.push(1);
        s.push(7);
        s.push(8);
        s.push(2);
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();

        }
        
    }
}