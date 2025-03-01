package src.Day_24_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStream {
    public static void main(String[] args) {
        String data = "Hello, this is a test using FileOutputStream.";

        try(FileOutputStream fos = new FileOutputStream("src/Day_24_IO/resources/output.txt")){
            byte[] bytes = data.getBytes();

            //writing sequentially onto the file output stream
            //This method does not automatically flush the data to the file immediately—it may be buffered
            fos.write(bytes);

            //The flush() method ensures that any buffered data is actually written to the file immediately.
            fos.flush();

            System.out.println("Data written to file successfully.");
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
