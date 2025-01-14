package Module6;

import java.util.function.Function;
import java.util.function.Predicate;

public class TaskTernaryOperator {
    public static <T, U> Function<T, U> ternaryOperator
            (Predicate<? super T> condition,
             Function<? super T, ? extends U> ifTrue, Function<? super T, ? extends U> ifFalse) {
        return (T t) -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
