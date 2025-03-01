package src.Day_24_IO.CreatingDirectory;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirPath = "src/Day_24_IO/CreatingDirectory/new";

        File dir = new File(dirPath);
        if(!dir.exists()){
            if(dir.mkdir()){
                System.out.println("Directory created successfully.");
            }
            else{
                System.out.println("Directory could not be created.");
            }
        }
        else{
            System.out.println("Directory already exists.");
        }
    }
}
