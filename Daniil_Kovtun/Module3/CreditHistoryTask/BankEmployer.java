package Module3.CreditHistoryTask;

public class BankEmployer implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.isCreditHistory() && bankClient.isProblemWithLaw()) {
            return true;
        } else if (bankClient.isCreditHistory() == false) {
            throw new BadCreditHistoryException();
        } else if (bankClient.isProblemWithLaw() == false) {
            throw new ProblemWithLawException();
        } else return false;
    }
}
