package Module4;
import java.io.*;
public class TaskIntSumOfStream {
    public int sumOfStream(InputStream inputStream) throws IOException {
        int summ = 0;
        int i=-1;
        while((i=inputStream.read())!=-1 && inputStream.available() != 0){
            summ += (byte) i;
        }
        return summ;
    }
}
