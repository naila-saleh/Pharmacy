import java.util.Arrays;

public class Clients {
    private String name;
    private int ID;
    private Sales[]purchases;
    private String paymentMethod;
    private double totalPrice;
    private String dateOfBuy;

    public void amountOfDept(){
        System.out.println("the left amount of dept = "+new Depts(ID).getAmountOfDebt());
    }

    public void payForDept(double amountOfMoney){
        new Depts(ID).setAmountOfDebt(new Depts(ID).getAmountOfDebt()-amountOfMoney);
    }

    public void MedicineInfo(int medicineID,String paymentMethod,int quantity,Medicine[] medicines){
        int index=0;
        for(int i=0;i<medicines.length;i++){
            if(medicines[i].getID()==medicineID){
                index=i;
                break;
            }
        }
        System.out.println(medicines[index].getName()+"\n"+medicines[index].getPrice());
        Depts depts=new Depts();
        if(paymentMethod.equals("dept")){
            depts.setAmountOfDebt(medicines[index].getPrice()*quantity);
            System.out.println(this.name+" has depts of amount : "+depts.getAmountOfDebt());
        }else if(paymentMethod=="cash"){
            System.out.println(this.name+" has depts of amount : "+depts.getAmountOfDebt());
        }else{
            System.out.println("not available payment method");
        }
        Sales sales=new Sales(medicineID,medicines[index].getPrice());
        sales.setQuantity(sales.getQuantity()-quantity);
        this.totalPrice=medicines[index].getPrice()*quantity;
        System.out.println("total price = "+this.totalPrice);
        System.out.println("Any Discounts? "+sales.isDiscount(this.totalPrice)+"%");
        System.out.println("total price after discount = "+(this.totalPrice-this.totalPrice*sales.isDiscount(this.totalPrice)/100));
        this.totalPrice=0;
    }

    public void MedicineInfo(Sales[] purchases,Medicine[] medicines){
        for(int i=0;i<purchases.length;i++){
            int index=0;
            for(int j=0;j<medicines.length;j++){
                if(medicines[j].getID()==purchases[i].getItemID()){
                    index=j;
                    break;
                }
            }
            this.totalPrice+=medicines[index].getPrice()*purchases[i].getQuantity();
            System.out.println(medicines[index].getName()+"\n"+medicines[index].getPrice());
            Depts depts=new Depts();
            if(paymentMethod.equals("dept")){
                depts.setAmountOfDebt(medicines[index].getPrice()*purchases[i].getQuantity());
                System.out.println(this.name+" has depts of amount : "+depts.getAmountOfDebt());
            }else if(paymentMethod=="cash"){
                System.out.println(this.name+" has depts of amount : "+depts.getAmountOfDebt());
            }else{
                System.out.println("not available payment method");
            }
            Sales sales=new Sales(purchases[i].getItemID(),medicines[index].getPrice());
            sales.setQuantity(sales.getQuantity()-purchases[i].getQuantity());
            System.out.println("\n*************************************\n");
        }
        System.out.println("total price = "+this.totalPrice);
        System.out.println("Any Discounts? "+new Sales().isDiscount(this.totalPrice)+"%");
        System.out.println("total price after discount = "+(this.totalPrice-this.totalPrice*new Sales().isDiscount(this.totalPrice)/100));
        this.totalPrice=0;
    }

    public Clients() {
    }

    public Clients(String name, int ID, Sales[] purchases, String paymentMethod) {
        this.name = name;
        this.ID = ID;
        this.purchases = purchases;
        this.paymentMethod = paymentMethod;
    }

    public Clients(int ID, Sales[] purchases) {
        this.ID = ID;
        this.purchases = purchases;
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

    public Sales[] getPurchases() {
        return purchases;
    }

    public void setPurchases(Sales[] purchases) {
        this.purchases = purchases;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDateOfBuy() {
        return dateOfBuy;
    }

    public void setDateOfBuy(String dateOfBuy) {
        this.dateOfBuy = dateOfBuy;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", purchases=" + Arrays.toString(purchases) +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", totalPrice=" + totalPrice +
                ", dateOfBuy='" + dateOfBuy + '\'' +
                '}';
    }
}