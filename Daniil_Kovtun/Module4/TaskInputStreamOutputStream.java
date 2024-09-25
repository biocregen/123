package Module4;
import java.io.*;
public class TaskInputStreamOutputStream {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i=-1;
        while((i=inputStream.read())!=-1){
            if (i % 2 == 0) {
                outputStream.write(i);
            }
        }
        outputStream.close();
    }

}
