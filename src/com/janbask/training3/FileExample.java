package com.janbask.training3;
import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        //ToDo: change this as per your local system path
        String fname = "/Users/pradeepsingh/Desktop/Screen Shot 2017-08-05 at 12.33.16 AM.png";
        if(args.length>0) {
            //accept file name or directory name through command line args
            fname = args[0];
        }
        accessFile(fname);

        //Now list contents of a directory
        try{
            listDirectoryContents();
        }
        catch (IOException ioException){
            System.err.printf("\nThere was an error: %s", ioException.getMessage());
        }
    }

    static void accessFile(String fname){
        //pass the filename or directory name to File object
        File f = new File(fname);

        //apply File class methods on File object
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path:" + f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists :" + f.exists());
        if (f.exists()) {
            System.out.println("Is writeable: " + f.canWrite());
            System.out.println("Is readable: " + f.canRead());
            System.out.println("Is a directory: " + f.isDirectory());
            System.out.println("File Size in bytes: " + f.length());
        }
    }

    static void listDirectoryContents() throws IOException{
        //enter the path and dirname from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter dirpath:");
        String dirpath=br.readLine();
        System.out.println("Enter the dirname");
        String dname=br.readLine();

        //create File object with dirpath and dname
        File f = new File(dirpath, dname);

        //if directory exists,then
        if(f.exists())
        {
            //get the contents into arr[]
            //now arr[i] represent either a File or Directory
            String arr[]=f.list();

            //find no. of entries in the directory
            int n=arr.length;

            //displaying the entries
            for (int i = 0; i < n ; i++) {
                System.out.println(arr[i]);
                //create File object with the entry and test
                //if it is a file or directory
                File f1=new File(arr[i]);
                if(f1.isFile())
                    System.out.println(": is a file");
                if(f1.isDirectory())
                    System.out.println(": is a directory");
            }
            System.out.println("No of entries in this directory "+n);
        }
        else
            System.out.println("Directory not found");
    }
}
