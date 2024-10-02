package Module4.TaskMailServise;

import java.util.logging.Level;
import java.util.logging.Logger;
import static Module4.TaskMailServise.Main.AUSTIN_POWERS;
public class Spy implements MailService {
    public static Logger LOGGER;
    public Spy (Logger logger) {
        this.LOGGER = logger;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage mailMessage = (MailMessage) mail;
            if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from " +
                        mail.getFrom() + " to " + mail.getTo() + " \"" +
                        mailMessage.getMessage() + " \"");
            } else {
                LOGGER.log(Level.INFO, "Usual correspondence: from "
                        + ((MailMessage) mail).getFrom() + " to " + ((MailMessage) mail).getTo());
            }
            return mailMessage;
        } return mail;
    }
}
