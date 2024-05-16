import java.util.*;
public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy=new Pharmacy("Osama's Pharmacy","osama sabri");
        pharmacy.setItemClassifications(new String[]{"Drugs","Cleaners","Cosmetics","Food Supplements","Baby Supplies"});
        pharmacy.setWorkers(new Workers[]{new Workers( "osama sabri",1,8000),
                new Workers("hatem sabri",2,5000),new Workers("salam riji",3,4000)});
        pharmacy.setMedicines(new Medicine[]{new Medicine("ISOMAR",202238,60),new Medicine("Acamole",202277,30),
                new Medicine("Dermalux",202289,45),new Medicine("Panadol",202278,25),
                new Medicine("Kebra",202244,72),new Medicine("FML",202261,43)});
        pharmacy.getMedicines()[1].setAlternatives(new String[]{"Tramadol","Gabapentin"});
        pharmacy.getMedicines()[0].setAlternatives(new String[]{"Systance","Blink"});
        pharmacy.setClients(new Clients[]{
                new Clients("naila",19,new Sales[]{new Sales(202261,1),new Sales(202238,2)},"cash"),
        new Clients("jawad",22,new Sales[]{new Sales(202277,3),new Sales(202244,1)},"dept")});
        printClientsMedicineInfo(pharmacy);
    }

    private static void printClientsMedicineInfo(Pharmacy p) {
        for (int i = 0; i < p.getClients().length; i++) {
            System.out.println(p.getClients()[i].getName()+" : ");
            /*for (int j = 0; j < p.getClients()[i].getPurchases().length; j++) {
                p.getClients()[i].MedicineInfo(p.getClients()[i].getPurchases()[j].getItemID(),p.getClients()[i].getPaymentMethod(),p.getClients()[i].getPurchases()[j].getQuantity());
            }*/
            p.getClients()[i].MedicineInfo(p.getClients()[i].getPurchases(), p.getMedicines());
            System.out.println("\n-------------------------------------------------------------------\n");
        }
    }
}