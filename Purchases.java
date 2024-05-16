import java.util.Arrays;

public class Purchases {
    private int itemID;
    private String itemName;
    private double cost;
    private String exportCountry;
    private String shipmentArrivalDate;
    private String[]imports;
    private double quantity;
    public Purchases() {
    }

    public Purchases(int itemID, double cost, double quantity) {
        this.itemID = itemID;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Purchases(int itemID, double cost, String shipmentArrivalDate, double quantity) {
        this.itemID = itemID;
        this.cost = cost;
        this.shipmentArrivalDate = shipmentArrivalDate;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    public String getShipmentArrivalDate() {
        return shipmentArrivalDate;
    }

    public void setShipmentArrivalDate(String shipmentArrivalDate) {
        this.shipmentArrivalDate = shipmentArrivalDate;
    }

    public String[] getImports() {
        return imports;
    }

    public void setImports(String[] imports) {
        this.imports = imports;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchases{" +
                "itemID=" + itemID +
                ", cost=" + cost +
                ", exportCountry='" + exportCountry + '\'' +
                ", shipmentArrivalDate='" + shipmentArrivalDate + '\'' +
                ", imports=" + Arrays.toString(imports) +
                ", quantity=" + quantity +
                '}';
    }
}