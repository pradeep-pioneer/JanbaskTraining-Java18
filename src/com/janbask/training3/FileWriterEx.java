package com.janbask.training3;
import java.io.*;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the name of file to write to: ");
        String fileNameInput = in.nextLine();

        System.out.println("\nEnter the content that you want to write: ");
        String fileContentInput = in.nextLine();
        writeToFile(fileNameInput,fileContentInput);
    }
    static void writeToFile(String fileName, String content){
        try{
            FileWriter fw=new FileWriter(fileName);
            fw.write(content);
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}
