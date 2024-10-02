package Module4.TaskMailServise;

public class UntrustworthyMailWorker implements MailService {
    private MailService[] mailServices;
    private final RealMailService realMailService = new RealMailService();
    public UntrustworthyMailWorker (MailService[] mailServices) {
        this.mailServices = mailServices;
    }
    public RealMailService getRealMailService() {
        return this.realMailService;
    }
    @Override
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
        Sendable s = mail;
        for (MailService ms : mailServices) {
            s = ms.processMail(s);
        }
        return realMailService.processMail(s);
    }

}
