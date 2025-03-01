package src.Day_24_IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStream {
    public static void main(String[] args) {
        String data = "Hello, this is a test using BufferOutputStream.";

        try(FileOutputStream fos = new FileOutputStream("src/Day_24_IO/resources/bufferOPStream_output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos)){
            //BufferOutputStream added additional layer around the file output stream
            //This helps writing data byte by byte, it writes larger chunks, which reduce the number of operations
            //And improve the performance.

            byte[] bytes = data.getBytes();

            //writing sequentially onto the file output stream
            //This method does not automatically flush the data to the file immediately—it may be buffered
            bos.write(bytes);

            //The flush() method ensures that any buffered data is actually written to the file immediately.
            bos.flush();

            System.out.println("Data written to file successfully.");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
