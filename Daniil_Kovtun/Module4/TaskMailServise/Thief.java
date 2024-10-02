package Module4.TaskMailServise;

import java.util.concurrent.locks.StampedLock;

public class Thief implements MailService {
    private int minPrice;
    private int StolenValue = 0;
        public Thief (int minPrice) {
            this.minPrice = minPrice;
        }
    @Override
    public Sendable processMail(Sendable mail) {
        if (((MailPackage) mail).getContent().getPrice() >= minPrice) {
            Package stolenPackage = new Package("stones instead of "
                    + ((MailPackage) mail).getContent().getContent(), 0);
            MailPackage stolenMailPackage = new MailPackage(((MailPackage) mail).from,
                    ((MailPackage) mail).to, stolenPackage);
            StolenValue += ((MailPackage) mail).getContent().getPrice();
            return stolenMailPackage;
        } else {
            return mail;
        }
    }
    public int getStolenValue() {
            return StolenValue;
    }
}
