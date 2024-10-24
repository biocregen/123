package Module6;

public class TaskNumberGeneratorStream {
        public static NumberGenerator<? super Number> getGenerator() {
            return  a -> a.intValue() > 0;
        }
}
