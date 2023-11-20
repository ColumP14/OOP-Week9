package ie.atu;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) {
        String fileName = "File13.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            //There is no close method called. This is a try with resources
            //Write content ot the file
            writer.write("Im blue daba di daba die");

            System.out.println("Content Successfully written to the file.");
        } catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }


}
