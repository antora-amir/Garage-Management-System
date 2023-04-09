package GarageManagement;
abstract public class Owner {//By using abstract I used abstraction
    private String area;//By making the fields private and using getter setter I used encapsulation
    private String name;
    public Owner() {//Constructor
        this.name="Anonymous";
        this.area="Unknown";
    }
    public Owner(String area, String name) {//By making a Constructor I used polymorphism
        this.area=area;
        this.name=name;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void  display(){
        System.out.println("The Details of this GarageOwner is below:");
        System.out.println("Name: "+this.name);
        System.out.println("Area: "+this.area);
    }
}