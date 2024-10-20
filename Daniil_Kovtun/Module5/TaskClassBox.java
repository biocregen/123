package Module5;

import java.util.Optional;

public class TaskClassBox <T> {
    private Optional <T> object;

    public static <T> TaskClassBox <T> getBox() {
        return new <T> TaskClassBox() ;
    }
}
