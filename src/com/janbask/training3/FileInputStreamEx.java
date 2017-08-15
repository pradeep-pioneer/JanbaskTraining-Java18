package com.janbask.training3;
import java.io.*;
import java.util.Scanner;

public class FileInputStreamEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the name of file to read character: ");
        String fileNameInput = in.nextLine();
        readSingleCharacter(fileNameInput);
        System.out.println("\nEnter the name of file to read all characters: ");
        fileNameInput = in.nextLine();
        readAllCharacters(fileNameInput);
    }

    static void readSingleCharacter(String fileName){
        try{
            FileInputStream fin=new FileInputStream(fileName);
            int i=fin.read();
            System.out.printf("File character read: %s",(char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }

    static void readAllCharacters(String fileName){
        try{
            FileInputStream fin=new FileInputStream(fileName);
            int i=0;
            System.out.print("File characters read:");
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
