import java.util.*;

public class Medicine {
    private String name;
    private int ID;
    private String productoinFirm;
    private double price;
    private String expiredDate;
    private String[]validTypes;
    private String[]alternatives;
    private String manufacturingCountry;
    private int leftQuantity;
    public static int NoOfPatientsUses;

    public void Discount(double discount){
        System.out.println(this.ID+" price = "+this.price);
        this.price*=discount/100;
        System.out.println(this.ID+" price after "+discount+"% discount = "+this.price);
    }

    public void monthlyUsePercentage(){
        System.out.println("monthly use percentage : "+(double) leftQuantity/NoOfPatientsUses);
    }

    public void refillAmount(){
        if(this.leftQuantity<10) {
            leftQuantity = 50;
            Purchases purchases=new Purchases(this.ID,this.price,50-this.leftQuantity);
            new Depts(this.ID,50-this.leftQuantity*this.price);
        }
    }

    public Medicine() {
    }

    public Medicine(int ID) {
        this.ID = ID;
        NoOfPatientsUses++;
    }

    public Medicine(int ID, double price, String expiredDate) {
        this.ID = ID;
        this.price = price;
        this.expiredDate = expiredDate;
        NoOfPatientsUses++;
    }

    public Medicine(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        NoOfPatientsUses++;
    }

    public Medicine(int ID, String[] alternatives) {
        this.ID = ID;
        this.alternatives = alternatives;
        NoOfPatientsUses++;
    }

    public Medicine(String name, int ID, String[] validTypes) {
        this.name = name;
        this.ID = ID;
        this.validTypes = validTypes;
        NoOfPatientsUses++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProductoinFirm() {
        return productoinFirm;
    }

    public void setProductoinFirm(String productoinFirm) {
        this.productoinFirm = productoinFirm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String[] getValidTypes() {
        return validTypes;
    }

    public void setValidTypes(String[] validTypes) {
        this.validTypes = validTypes;
    }

    public String[] getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(String[] alternatives) {
        this.alternatives = alternatives;
    }

    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public void setManufacturingCountry(String manufacturingCountry) {
        this.manufacturingCountry = manufacturingCountry;
    }

    public int getLeftQuantity() {
        return leftQuantity;
    }

    public void setLeftQuantity(int leftQuantity) {
        this.leftQuantity = leftQuantity;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", productoinFirm='" + productoinFirm + '\'' +
                ", price=" + price +
                ", expiredDate='" + expiredDate + '\'' +
                ", validTypes=" + Arrays.toString(validTypes) +
                ", alternatives=" + Arrays.toString(alternatives) +
                ", manufacturingCountry='" + manufacturingCountry + '\'' +
                ", leftQuantity=" + leftQuantity +
                '}';
    }
}