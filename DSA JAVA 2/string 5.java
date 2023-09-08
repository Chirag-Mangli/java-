class firstclass{
    public static void main(String[] args) {
        String fruit[]={"apple", "baanan ", "cjjj"};
        String l= fruit[0];
        for(int i=0; i<fruit.length;i++){
            if (l.compareTo(fruit[i])<0){

                l= fruit[i];
                System.out.println(l);
            }
        }
    }
}