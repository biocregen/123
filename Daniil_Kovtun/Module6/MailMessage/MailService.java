package Module6.MailMessage;

import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer <Sendable <T>> {


    private Map <String, List<T>> mailBox;
    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
    public MailService () {
        this.mailBox = new MyHashMap<>();
    }

    @Override
    public void accept(Sendable <T> t) {
        if(mailBox.containsKey(t.getTo())) {

            List<T> val;

            val = mailBox.get(t.getTo());

            val.add(t.getContent());

            mailBox.put(t.getTo(), val);

        } else {

            List<T> val;

            val = new LinkedList<>();

            val.add(t.getContent());

            mailBox.put(t.getTo(), val);

        }
    }
    public class MyHashMap <K,V> extends HashMap <K,V>  {
        @Override
        public V get(Object key) {
            return getOrDefault(key, (V) Collections.emptyList());
        }

    }
}
