public class A {
    static void b(int x){
        System.out.println("Argument= "+ x);
    }
    static void b(int y,int z){
        System.out.println("Argument= " + y + "and" + z);
    }

    public static void main(String[] args) {
        b(5);
        b(6,10);
    }
}
