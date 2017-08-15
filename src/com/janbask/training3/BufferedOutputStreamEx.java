package com.janbask.training3;
import java.io.*;
import java.util.Scanner;

public class BufferedOutputStreamEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the name of file to write to: ");
        String fileNameInput = in.nextLine();

        System.out.println("\nEnter the content that you want to write: ");
        String fileContentInput = in.nextLine();
        try {
            writeTextOutput(fileNameInput, fileContentInput);
        }
        catch (FileNotFoundException fileNotFoundException){
            logException(fileNotFoundException);
        }
        catch (IOException ioException){
            logException(ioException);
        }
    }

    static void writeTextOutput(String fileName, String textToWrite) throws FileNotFoundException, IOException{
        FileOutputStream fout=new FileOutputStream(fileName);
        BufferedOutputStream bout=new BufferedOutputStream(fout);

        byte b[]=textToWrite.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }

    static void logException(Exception exception){
        System.out.printf("Error: %s\nMessage: %s", exception.getClass().getName(), exception.getMessage());
    }
}
