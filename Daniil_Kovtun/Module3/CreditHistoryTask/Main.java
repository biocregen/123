package Module3.CreditHistoryTask;

public class Main {
    static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException{
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException a) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException b) {
            return false;
        }
    }

    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {
        BankClient bankClient1 = new BankClient(true, false);
        BankClient bankClient2 = new BankClient(true, true);
        BankClient bankClient3 = new BankClient(false, false);
        BankClient bankClient4 = new BankClient(true, false);
        BankWorker bankWorker = new BankEmployer();
        System.out.println(getCreditForClient(bankWorker, bankClient1));
        System.out.println(getCreditForClient(bankWorker, bankClient2));
        System.out.println(getCreditForClient(bankWorker, bankClient3));
        System.out.println(getCreditForClient(bankWorker, bankClient4));
    }
}
