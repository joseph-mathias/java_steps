import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NonBloockingIO {

    public static void main(String[] args) throws IOException {
        FileInputStream fin;
        try {
            fin = new FileInputStream("");
            FileChannel readChannel = fin.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            int result = readChannel.read(readBuffer);

            System.out.println("file read successfully " + result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FileInputStream fout =null;
        try{
            fout = new FileInputStream("");
            FileChannel writeChannel = fout.getChannel();
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);

            String msg = "Hello, World!";

            writeBuffer.put(msg.getBytes());
            writeBuffer.flip();
            writeChannel.write(writeBuffer);
            System.out.println("Successfully");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }    
}
