package Module3.CreditHistoryTask;

public class BankClient {

    private boolean creditHistory;
    private boolean problemWithLaw;
    public BankClient(boolean a,boolean b) {
        this.creditHistory = a;
        this.problemWithLaw = b;
    }

    public boolean isCreditHistory() {
        return creditHistory;
    }

    public boolean isProblemWithLaw() {
        return problemWithLaw;
    }
}
