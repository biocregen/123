package Module6.MailMessage;

public interface  Sendable <T> {
    public String getFrom();
    public String getTo();
    public T getContent();
}
