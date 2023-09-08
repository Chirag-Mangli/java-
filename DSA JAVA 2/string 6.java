class firstclass{
    public static void ss(String fruit[]){
        String a=fruit[0];
        for (int i=0; i<fruit.length; i++){
            if (a.compareTo(fruit[i])<0){
                a= fruit[i];
            }
        }System.out.println(a);
    }
    public static void main(String[] args) {
        String fruit[]={ "apple", "mango", "banana", "graps"};
        ss(fruit);

    }
}