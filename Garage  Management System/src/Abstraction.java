abstract public class Abstraction {
    public int b;
    Abstraction(int a){
        System.out.println("Its Constructor"+a);

    }
    abstract void absdiplay();
    abstract void absset();
    void normal(){
        System.out.println("Its Normal");
    }
}
