

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        FileInputStream readerStream = null;
        FileOutputStream writerStream = null;
        // FileWriter- FileReader

        try {
            readerStream = new FileInputStream("C:\\Users\\Nchimunya\\Desktop\\jams.txt");
            writerStream = new FileOutputStream("C:\\Users\\Nchimunya\\Desktop\\ams.txt");
            int content;
            while ((content = readerStream.read()) != -1) {
                writerStream.write((byte) content);
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            if (readerStream != null) {
                readerStream.close();
            }
            if (writerStream != null) {
                writerStream.close();
            }
        }
    }
}