package com.janbask.training3;
import java.io.*;
import java.util.Scanner;

public class BufferedInputStreamEx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the name of file to read from: ");
        String fileNameInput = in.nextLine();
        readFileBuffered(fileNameInput);
    }
    static void readFileBuffered(String fileName){
        try{
            FileInputStream fin=new FileInputStream(fileName);
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            System.out.println("\nFileContents: ");
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
