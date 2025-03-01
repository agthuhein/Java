package src.Day_24_IO;

import java.io.ByteArrayInputStream;

public class ByteInputStream {
    public static void main(String[] args) {
        byte[] data = {72, 101, 108, 108, 111};    //ASCII

        ByteArrayInputStream inputStream = null;

        try{
            inputStream = new ByteArrayInputStream(data);
            int byteData;
            while((byteData = inputStream.read()) != -1){       //This read method return int.
                System.out.print((char)byteData);
            }
        }catch (Exception e){
            System.out.println("Error during input stream");
        }finally {
            if(inputStream != null){
                try{
                    inputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    }
}
