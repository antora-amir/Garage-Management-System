import GarageManagement.GarageOwner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        GarageOwner antora=new GarageOwner("Mirpur","Antora",10,10);
        GarageOwner safwan[]=new GarageOwner[3];
        safwan[0]=new GarageOwner("Area 1","Name 1",5,5);
        safwan[1]=new GarageOwner("Area 2","Name 2",6,6);
        safwan[2]=new GarageOwner();
        safwan[2].display();
        safwan[2].setArea("Java");
        safwan[2].setName("Safwan");
        safwan[2].setGaragesz(20);
        safwan[2].setChargeperhour(15);
        safwan[2].display();
        safwan[0].display();
        safwan[1].display();
        antora.display();


        String name=scanner.nextLine();
        String area=scanner.nextLine();
        int size=scanner.nextInt();
        int chargeperhour=scanner.nextInt();
        GarageOwner farzana= new GarageOwner(area,name,size,chargeperhour);
        farzana.display();






    }
}