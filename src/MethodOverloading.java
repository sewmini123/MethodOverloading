public class MethodOverloading {
    void display(int a,double b){
        System.out.println("method 1");
    }
    void display(int a,double b,double c){
        System.out.println("method 2");
    }
    public static void main(String[] args) {
        MethodOverloading mal=new MethodOverloading();
        mal.display(3,4.5);
        mal.display(4,5.6,7.8);
    }
}
