import java.util.Stack;

class firstclass{
    public static void pushbootam(Stack<Integer>s,int  data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushbootam(s, data);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer>s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(9);
        int data=6;
        pushbootam(s, data);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}