import java.util.Arrays;

public class Workers {
    private String name;
    private int ID;
    private long phoneNumber;
    private String[]workPeriods;
    private double salary;
    private int warnings;
    private String dateOfHiring;
    private int branchesID;

    public void canFired(){
        if(this.warnings>=3) System.out.println("Fired");
        else System.out.println("can stay at work");
    }

    public void Bonus(double bonus){
        System.out.println(this.name+" salary is : "+this.salary);
        this.salary+=bonus;
        System.out.println(this.name+" salary after bonus is : "+this.salary);
    }

    public void Discount(double discount){
        System.out.println(this.name+" salary is : "+this.salary);
        this.salary+=discount;
        System.out.println(this.name+" salary after discount is : "+this.salary);
    }

    public Workers() {
    }

    public Workers(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public Workers(String name, int ID, long phoneNumber, String dateOfHiring) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.dateOfHiring = dateOfHiring;
    }

    public int getBranchesID() {
        return branchesID;
    }

    public void setBranchesID(int branchesID) {
        this.branchesID = branchesID;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getWorkPeriods() {
        return workPeriods;
    }

    public void setWorkPeriods(String[] workPeriods) {
        this.workPeriods = workPeriods;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWarnings() {
        return warnings;
    }

    public void setWarnings(int warnings) {
        this.warnings = warnings;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", phoneNumber=" + phoneNumber +
                ", workPeriods=" + Arrays.toString(workPeriods) +
                ", salary=" + salary +
                ", warnings=" + warnings +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                '}';
    }
}