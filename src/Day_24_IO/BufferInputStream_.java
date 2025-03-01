package src.Day_24_IO;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferInputStream_ {
    public static void main(String[] args) {
        InputStream fileStream = DataInputStream_.class.getClassLoader().getResourceAsStream("output.txt");

        if(fileStream == null){
            System.out.println("File doesn't exist.");
            return;
        }

        try(BufferedInputStream bis = new BufferedInputStream(fileStream)){
            int data;
            while((data = bis.read()) != -1){
                System.out.print((char)data);
            }
            System.out.println("\nData reading from file is successful.");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
