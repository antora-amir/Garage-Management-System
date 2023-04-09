package GarageManagement;
public class GarageOwner extends Owner {// By inheriting from another class I used inheritance
    private int garagesz;
    private int chargeperhour;
    public GarageOwner(){
        super();
        this.chargeperhour=-1;
        this.garagesz=-1;
    }
    public GarageOwner(String area, String name, int garagesz, int chargeperhour) {
        super(area, name);
        this.garagesz=garagesz;
        this.chargeperhour=chargeperhour;
    }
    public int getGaragesz() {
        return garagesz;
    }
    public void setGaragesz(int garagesz) {
        this.garagesz = garagesz;
    }

    public int getChargeperhour() {
        return chargeperhour;
    }
    public void setChargeperhour(int chargeperhour) {
        this.chargeperhour = chargeperhour;
    }
    @Override public void display() {
        super.display();
        System.out.println("Garage Size: "+this.garagesz);
        System.out.println("Garage Charge Per Hour: "+this.chargeperhour+"\n");
    } }
