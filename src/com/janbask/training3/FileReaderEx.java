package com.janbask.training3;
import java.io.*;
import java.util.Scanner;

public class FileReaderEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the name of file to read from: ");
        String fileNameInput = in.nextLine();
        try{readFileChar(fileNameInput);}
        catch (FileNotFoundException fileNotFoundException){logException(fileNotFoundException);}
        catch (IOException ioException){logException(ioException);}
    }
    static void readFile(String fileName) throws FileNotFoundException, IOException{
        FileReader fr=new FileReader(fileName);
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
    static void readFileChar(String fileName) throws FileNotFoundException, IOException{
        File fin = new File(fileName);
        FileReader fr=new FileReader(fileName);
        char[] buffer = new char[(int)fin.length()];
        fr.read(buffer);
        System.out.println(buffer);
        fr.close();
    }

    static void logException(Exception exception){
        System.out.printf("Error: %s\nMessage: %s", exception.getClass().getName(), exception.getMessage());
    }
}
