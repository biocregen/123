package Exceptions.CreditForCliend;

public interface BankWorker {
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}
