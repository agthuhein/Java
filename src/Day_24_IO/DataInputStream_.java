package src.Day_24_IO;

import java.io.*;

public class DataInputStream_ {
    public static void main(String[] args) {
        InputStream fileStream = DataInputStream_.class.getClassLoader().getResourceAsStream("dataOPStream_output.bin");

        if(fileStream == null){
            System.out.println("File doesn't exist.");
        }

        try(DataInputStream dis = new DataInputStream(fileStream)){
            double doubleValue = dis.readDouble();
            char charValue = dis.readChar();
            int intValue = dis.readInt();
            String stringValue = dis.readUTF();

            System.out.println(doubleValue);
            System.out.println(charValue);
            System.out.println(intValue);
            System.out.println(stringValue);

            System.out.println("Data reading from file is successful.");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
