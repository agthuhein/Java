package src.Day_24_IO.File_Handling;

import java.io.File;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args) {
        String path = "src/Day_24_IO/File_Handling/newFile.txt";

        String renameFilePath = "src/Day_24_IO/File_Handling/newFileChanged.txt";

        File file = new File(path);
        if (file.exists()) {
            System.out.println("File exists");
        }
        else {
            System.out.println("File does not exist. Creating it...");
            try{
                if(file.createNewFile()){
                    System.out.println("File created " + file.getName());
                }
                else{
                    System.out.println("Failed to create file");
                }
            }catch (IOException e){
                System.out.println("An error occurred while creating a file " + e.getMessage());
                e.printStackTrace();
            }
        }
        File renameFile = new File(renameFilePath);
        if(file.renameTo(renameFile)){
            System.out.println("Rename file exists " + renameFile.getName());
        }
        else{
            System.out.println("Renaming file is failed...");
        }
        if(renameFile.delete()){
            System.out.println("File deleted " + renameFile.getName());
        }
        else{
            System.out.println("Failed to delete file " + renameFile.getName());
        }
    }
}
