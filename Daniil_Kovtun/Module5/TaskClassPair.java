package Module5;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class TaskClassPair <K, V> {
    final K first;
    final V second;

    private TaskClassPair(K first, V second) {
        this.first = first;
        this.second = second;
    }
    public K getFirst() {
        if (first == null) {
            throw new NoSuchElementException("No value present");
        }
        return first;
    }
    public V getSecond() {
        if (first == null) {
            throw new NoSuchElementException("No value present");
        }
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskClassPair<?, ?> that = (TaskClassPair<?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static <K, V> TaskClassPair <K, V> of(K first, V second) {
        return new TaskClassPair<>(first, second);
    }
}