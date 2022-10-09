 class Numbers {
    static void anything() {
        int a = 4;
        int b = 7;
        int c = a + b;
        System.out.println(c);
    }

    static int anything(int x){
        x=3+5+7;
        return x;
    }
    static void anything(String z,int y){
        y=13;
        z="millions";
        System.out.println(y+z);
    }
    public static void main(String[] args) {
         anything();
         anything("fghj",6);
        System.out.println(anything(2));
     }
}
