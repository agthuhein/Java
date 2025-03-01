package src.Day_24_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_ {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("src/Day_24_IO/resources/dataOPStream_output.bin");
            DataOutputStream dos = new DataOutputStream(fos)){

            dos.writeDouble(3.14);
            dos.writeChar('H');
            dos.writeInt(42);
            dos.writeUTF("This is a string");
            dos.flush();

            System.out.println("Data written to file successfully.");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
