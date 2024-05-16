public class Sales {
    private int itemID;
    private String itemName;
    private double price;
    private double profit;
    private int quantity;

    public int isDiscount(double price){
        if(price>300)return 25;
        else if(price>200)return 10;
        else if(price>100)return 5;
        else return 0;
    }

    public Sales() {
    }

    public Sales(int itemID, double price, int quantity) {
        this.itemID = itemID;
        this.price = price;
        this.quantity = quantity;
    }

    public Sales(int itemID, double price) {
        this.itemID = itemID;
        this.price = price;
    }

    public Sales(int itemID, int quantity) {
        this.itemID = itemID;
        this.quantity = quantity;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", profit=" + profit +
                ", quantity=" + quantity +
                '}';
    }
}