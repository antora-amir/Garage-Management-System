public class Microbus extends Vehicle{
    private int wheel;
    private int limits;

    public int getwheel(){return this.wheel;}
    public void setwheel(int wheel){
        this.wheel=wheel;
    }
    public int getLimits(){return this.limits;}
    public void setLimits(int limits){
        this.limits=limits;
    }

    @Override
    public void wheels() {
        System.out.println("4 Wheels");
    }

    @Override
    public void limits() {
        System.out.println("500 Kg");
    }

    public void display(){

        System.out.println(this.wheel+"\n"+this.limits);


    }
}
