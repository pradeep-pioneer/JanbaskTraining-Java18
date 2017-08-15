package com.janbask.training3;
import java.io.*;
import java.util.Scanner;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of file to save byte: ");
        String fileNameInput = in.nextLine();
        saveByte(fileNameInput);
        System.out.println("Enter the name of file to save string: ");
        fileNameInput = in.nextLine();
        saveString(fileNameInput);
    }

    static void saveByte(String fileName){
        try{
            FileOutputStream fout=new FileOutputStream(fileName);
            fout.write(65);
            fout.close();
            System.out.println("success - saved byte...");
        }catch(Exception e){System.out.println(e);}
    }

    static void saveString(String fileName){
        try{
            FileOutputStream fout=new FileOutputStream(fileName);
            String s="Welcome to Janbask Java Trainings.";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success - saved string...");
        }catch(Exception e){System.out.println(e);}
    }
}
