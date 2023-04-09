public class Abschild extends Abstraction{


    Abschild(int a) {
        super(a);
    }

    @Override
    void absdiplay() {
        System.out.println("Abschild says Hi!");
    }

    @Override
    void absset() {
        System.out.println("Absset");
    }

}
