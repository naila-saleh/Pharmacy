public class Depts {
    private String creditorName;
    private double amountOfDebt;
    private String debtReason;
    private int ID;

    public boolean ExceededLimit(){
        if(this.amountOfDebt>1000) return true;
        else return false;
    }
    public Depts() {
    }

    public Depts(int ID, double amountOfDebt) {
        this.amountOfDebt = amountOfDebt;
        this.ID = ID;
    }

    public Depts(String creditorName, double amountOfDebt, String debtReason, int ID) {
        this.creditorName = creditorName;
        this.amountOfDebt = amountOfDebt;
        this.debtReason = debtReason;
        this.ID = ID;
    }

    public Depts(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public double getAmountOfDebt() {
        return amountOfDebt;
    }

    public void setAmountOfDebt(double amountOfDebt) {
        this.amountOfDebt = amountOfDebt;
    }

    public String getDebtReason() {
        return debtReason;
    }

    public void setDebtReason(String debtReason) {
        this.debtReason = debtReason;
    }

    @Override
    public String toString() {
        return "Depts{" +
                "creditorName='" + creditorName + '\'' +
                ", amountOfDebt=" + amountOfDebt +
                ", debtReason='" + debtReason + '\'' +
                '}';
    }
}