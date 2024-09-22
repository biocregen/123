package Module3.CreditHistoryTask;

public interface BankWorker {
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}
