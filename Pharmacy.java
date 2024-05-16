import java.util.Arrays;

public class Pharmacy {
    private String name;
    private String owner;
    private int numberOfBranches;
    private String[]branches;
    private int numberOfItemClassifications;
    private String[]itemClassifications;
    private Clients[]clients;
    private Depts[]depts;
    private Medicine[]medicines;
    private Purchases[]purchases;
    private Workers[]workers;
    private Sales[]sales;

    public Pharmacy() {
    }

    public Pharmacy(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public Clients[] getClients() {
        return clients;
    }

    public void setClients(Clients[] clients) {
        this.clients = clients;
    }

    public Depts[] getDepts() {
        return depts;
    }

    public void setDepts(Depts[] depts) {
        this.depts = depts;
    }

    public Medicine[] getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    public Purchases[] getPurchases() {
        return purchases;
    }

    public void setPurchases(Purchases[] purchases) {
        this.purchases = purchases;
    }

    public Workers[] getWorkers() {
        return workers;
    }

    public void setWorkers(Workers[] workers) {
        this.workers = workers;
    }

    public Sales[] getSales() {
        return sales;
    }

    public void setSales(Sales[] sales) {
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(int numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String[] getBranches() {
        return branches;
    }

    public void setBranches(String[] branches) {
        this.branches = branches;
    }

    public int getNumberOfItemClassifications() {
        return numberOfItemClassifications;
    }

    public void setNumberOfItemClassifications(int numberOfItemClassifications) {
        this.numberOfItemClassifications = numberOfItemClassifications;
    }

    public String[] getItemClassifications() {
        return itemClassifications;
    }

    public void setItemClassifications(String[] itemClassifications) {
        this.itemClassifications = itemClassifications;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", numberOfBranches=" + numberOfBranches +
                ", branches=" + Arrays.toString(branches) +
                ", numberOfItemClassifications=" + numberOfItemClassifications +
                ", itemClassifications=" + Arrays.toString(itemClassifications) +
                '}';
    }
}
